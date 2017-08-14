package _nikulin.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyApp extends JFrame {

    private String selectedCommand;

    public MyApp(String name) {
        super(name);
        prepareUI();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void prepareUI() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        setMyLabel(panel);
        setMyCombo(panel);
        setMyButton(panel);
        add(panel);
    }

    private void setMyLabel(JPanel panel) {
        panel.add(new JLabel("Run a program: "));
    }

    private void setMyCombo(JPanel panel) {
        selectedCommand = "calc.exe";
        ComboContainer[] values = {
                new ComboContainer("Calculator", "calc.exe"),
                new ComboContainer("Text editor", "notepad.exe")
        };
        JComboBox<ComboContainer> combo = new JComboBox<>(values);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCommand =
                        values[combo.getSelectedIndex()].getProgramCommand();
            }
        });
        panel.add(combo);
    }

    private void setMyButton(JPanel panel) {
        JButton button = new JButton("Run");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec(selectedCommand);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(button);
    }


    private class ComboContainer {
        private String programName;
        private String programCommand;

        public ComboContainer(String programName, String programCommand) {
            this.programName = programName;
            this.programCommand = programCommand;
        }

        public String getProgramName() {
            return programName;
        }

        public String getProgramCommand() {
            return programCommand;
        }

        @Override
        public String toString() {
            return programName;
        }
    }

}
