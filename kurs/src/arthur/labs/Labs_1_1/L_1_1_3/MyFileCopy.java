package arthur.labs.Labs_1_1.L_1_1_3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by arthk on 19.07.2017.
 * Write a class called MyFileCopy whose main(String[] args)
 * method copies one file (could be binary!) to another (args[0] to args[1]).
 *
 */
public class MyFileCopy {

    public static void main(String[] args) {

        if (args.length < 2)
        {
            throw new IllegalArgumentException("Illegal arguments!");
        }



        try ( FileInputStream fIs = new FileInputStream(args[0]);
        FileOutputStream fOs = new FileOutputStream(args[1]) )
        {
            int c;
            while ((c = fIs.read()) != -1)   fOs.write(c);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
