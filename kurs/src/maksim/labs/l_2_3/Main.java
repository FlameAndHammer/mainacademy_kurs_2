package maksim.labs.l_2_3;

/**
 * Created by Пк on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow window = new MyWindow();
        window.setWidth(1.2);
        window.setHeight(1.7);
        window.setNumberOfGlass(5);
        window.setColor("white");
        window.setOpen(true);
        window.printFields();

    }
}
