package yuriy.labs.labs_3.l_04.LabWork1_4_3.DemoGuiSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Ruble on 13.08.2017.
 */
public class MyApplication extends JFrame
{
    public MyApplication(String name)
    {
       super(name);
        setSize(300, 200);
        setLocation(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        //ControlsRun cr = new ControlsRun();
    }

    public static void main(String[] args)
    {
        JFrame frame = new MyApplication("MyApplication1");
        JPanel panel =  new JPanel(new FlowLayout());
        frame.add(panel);
        JLabel label = new JLabel("Run a Program");
        panel.add(label);


        JComboBox comboBox = new JComboBox(new String[]{"Calculator", "Notepad", "Paint"});
        panel.add(comboBox);

        JButton button = new JButton("Run");
        panel.add(button);


        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Process p = null;
                String choice = (String) comboBox.getSelectedItem();
                try
                {
                    switch (choice)
                    {
                        case "Calculator":
                            p = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                            break;
                        case "Notepad":
                            p = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe");
                            break;
                        case "Paint":
                            p = Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
                            break;
                    }
                }
                catch (IOException ex)
                {
                    System.out.println("Can't run a program");
                }

            }


        });

    }
}
