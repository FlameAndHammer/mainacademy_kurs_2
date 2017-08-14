package yuriy.labs.ClassWork.class_11_08_17;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ruble on 11.08.2017.
 */
public class SwingMy
{
    public static void main(String[] args)
    {
        JFrame jfrm = new JFrame("My Program");
        jfrm.setSize(600,200);
        jfrm.setLocation(100,200);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel =  new JPanel(new FlowLayout());
        jfrm.add(panel);




        for (int i = 0; i < 10; i++) {
            JButton  btn = new JButton ("key " + i);
            btn.getPreferredSize();
           // btn.addKeyListener(new  )
            {

            };
            //btn.setVisible(true);
            panel.add(btn);

        }
        jfrm.setVisible(true);





    }
}
