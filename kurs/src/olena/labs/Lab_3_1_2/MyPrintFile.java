package olena.labs.Lab_3_1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by elenafostachuk on 7/28/17.
 */
public class MyPrintFile {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Parameter File name doesn't exist");
            return;
        }
        BufferedReader buffReader =null;
        try {
            buffReader = new BufferedReader(new FileReader(args[0]));
            boolean ss;
            while (ss = buffReader.readLine() != null) {
                System.out.println(ss);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                buffReader.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
