package yuriy.labs.ClassWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("my prog");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 50, 50));
        frame.add(panel);

        JTextField textField = new JTextField();
        textField.setColumns(20);
        panel.add(textField);

        JLabel label = new JLabel("text");

        JButton btn = new JButton("Key: ");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {//JOptionPane.showInternalMessageDialog(ygjhm);
                label.setText(textField.getText());
            }
        });
        panel.add(btn);
        panel.add(label);

        frame.setVisible(true);
    }
}
