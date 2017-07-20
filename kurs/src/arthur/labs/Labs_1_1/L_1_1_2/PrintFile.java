package arthur.labs.Labs_1_1.L_1_1_2;

import java.io.*;

/**
 *
 * Write a class called PrintFile whose main(String[] args) method reads all the text
 * from the file mentioned on the command-line
 * (args[0]) line-by-line and prints it to standard out.
 */
public class PrintFile {
    public static void main(String[] args)  {
        if (args.length == 0)
        {
            //throw new IllegalArgumentException("Parameter File Name isn't exist");
            System.out.println("Parameter 'File Name' doesn't exist");
            return;
        }

        BufferedReader bReader = null;
        try {
            bReader = new BufferedReader(new FileReader(args[0]));

            String s2 ;
            while (( s2 = bReader.readLine()) != null) {
                    System.out.println(s2);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                bReader.close();
            } catch(Exception ex1) {
                ex1.printStackTrace();
            }
        }
    }
}
