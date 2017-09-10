package yuriy.labs.ClassWork.class_14_08_17;

import javax.swing.*;

/**
 * Created by Ruble on 13.08.2017.
 */
public class MyApplication extends JFrame
{
    public MyApplication(String name)
    {
       super(name);

        setLocation(100,100);
        prepareUI();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void prepareUI() {
        setSize(300, 200);
        JPanel panel = new JPanel();
        setMyLabel(panel);
        setMyCombo(panel);
        setMyButton(panel);
        add(panel);
    }

    private void setMyLabel (JPanel panel)
    {
        panel.add(new JLabel("Run a program: "));
    }

    private void setMyCombo (JPanel panel)
    {
        ComboContainer [] values =
                {
                new ComboContainer ("Calculator", "C:\\Windows\\system32\\calc.exe"),
                new ComboContainer ("Notepad", "C:\\Windows\\system32\\notepad.exe")
                };

        JComboBox<ComboContainer> combo = new JComboBox<>(values);
        panel.add(combo);
    }

    private void setMyButton (JPanel panel)
    {
        //panel.add(new JButton()

    }

    private class ComboContainer
    {
        private String programName;
        private String programComand;

        public String getProgramName() {
            return programName;
        }

        public String getProgramComand() {
            return programComand;
        }

        @Override
        public String toString() {
            return "comboContainer{" +
                    "programName='" + programName + '\'' +
                    '}';
        }

        public ComboContainer(String programName, String programComand) {
            this.programName = programName;
            this.programComand = programComand;



        }
    }


    public static void main(String[] args)
    {
        JFrame frame = new MyApplication("MyApplication1");
    }
}
