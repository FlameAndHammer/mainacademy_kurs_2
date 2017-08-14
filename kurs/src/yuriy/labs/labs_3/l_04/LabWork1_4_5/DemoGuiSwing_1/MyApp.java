package yuriy.labs.labs_3.l_04.LabWork1_4_5.DemoGuiSwing_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ruble on 14.08.2017.
 */
public class MyApp extends JFrame

    ///  ДУМАТЬ!!!!

{
    public MyApp(String name)
    {
        super(name);
        setSize(500, 300);
        setLocation(1,1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        JFrame frame = new MyApp("MyApplication2");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 15));
        frame.add(panel);

        JTextField textField1 = new JTextField();
        textField1.setColumns(20);
        panel.add(textField1);

        JLabel label1 = new JLabel("                         ");

        JButton btn1 = new JButton("Get_User_Name  ");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("User_Name: " + textField1.getText());
            }
        });
        panel.add(btn1);
        panel.add(label1);

        JLabel labelResult = new JLabel("Result");
        //panel.add.add(textField2);


        JTextField textField2 = new JTextField();
        textField2.setColumns(20);
        panel.add(textField2);

        JLabel label2 = new JLabel("                         ");

        JButton btn2 = new JButton("Get_Comp_Name");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("Comp_Name: " + textField2.getText());
            }
        });
        panel.add(btn2);
        panel.add(label2);


        frame.setVisible(true);
    }
}
