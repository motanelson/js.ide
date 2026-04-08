import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class MiniIDE extends JFrame {

    private JTextArea editor;
    private File currentFile;

    public MiniIDE() {
        setTitle("Mini JS IDE");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        editor = new JTextArea();
        editor.setBackground(Color.BLACK);
        editor.setForeground(Color.WHITE);
        editor.setCaretColor(Color.WHITE);
        editor.setFont(new Font("Consolas", Font.PLAIN, 14));

        add(new JScrollPane(editor), BorderLayout.CENTER);

        setJMenuBar(createMenu());
        add(createToolbar(), BorderLayout.NORTH);
    }

    private JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");

        newFile.addActionListener(e -> {
            editor.setText("");
            currentFile = null;
        });

        open.addActionListener(e -> openFile());
        save.addActionListener(e -> saveFile());

        file.add(newFile);
        file.add(open);
        file.add(save);

        bar.add(file);
        return bar;
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel();

        JButton run = new JButton("Run");
        JButton compile = new JButton("Compile");

        run.addActionListener(e -> runJS());
        compile.addActionListener(e -> compileJS());

        panel.add(run);
        panel.add(compile);

        return panel;
    }

    private void openFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("JS Files", "js"));

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = chooser.getSelectedFile();
            try {
                editor.setText(new String(Files.readAllBytes(currentFile.toPath())));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                currentFile = chooser.getSelectedFile();
            }
        }

        if (currentFile != null) {
            try {
                Files.write(currentFile.toPath(), editor.getText().getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void runJS() {
        if (currentFile == null) {
            JOptionPane.showMessageDialog(this, "Save file first!");
            return;
        }

        try {
            Process p = Runtime.getRuntime().exec("js " + currentFile.getAbsolutePath());
            showOutput(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void compileJS() {
    if (currentFile == null) {
        JOptionPane.showMessageDialog(this, "Save file first!");
        return;
    }

    try {
        String file = currentFile.getAbsolutePath();
        String base = file.replace(".js", "");
        String cFile = base + ".c";

        // 1. Gerar C
        Process p1 = Runtime.getRuntime().exec("js2c toc " + file + " " + cFile);
        p1.waitFor();

        // 2. Ler ficheiro gerado
        String content = new String(Files.readAllBytes(Paths.get(cFile)));

        // 3. Código a adicionar
        String header = "#include <stdio.h>\n" +
                        "void print(char *c){\n" +
                        "    printf(\"%s\",c);\n" +
                        "}\n";

        // 4. Corrigir main
        content = content.replace("static int main", "int main");

        // 5. Escrever ficheiro final
        Files.write(Paths.get(cFile), (header + content).getBytes());

        // 6. Compilar
        Process p2 = Runtime.getRuntime().exec("clang -o " + base + ".elf " + cFile);
        p2.waitFor();

        JOptionPane.showMessageDialog(this, "Compiled: " + base + ".elf");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void showOutput(Process p) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;

        JTextArea output = new JTextArea();
        output.setBackground(Color.BLACK);
        output.setForeground(Color.GREEN);

        while ((line = reader.readLine()) != null) {
            output.append(line + "\n");
        }

        JOptionPane.showMessageDialog(this, new JScrollPane(output), "Output", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MiniIDE().setVisible(true));
    }
}
