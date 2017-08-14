package yuriy.labs.labs_3.l_04.labWork1_4_1.DemoGuiSwing;

import javax.swing.*;

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
    }

    public static void main(String[] args)
    {
        JFrame frame = new MyApplication("MyApplication1");
    }
}
