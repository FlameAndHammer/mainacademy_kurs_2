package yuriy.labs.labs_3.l_01.l_1_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elenafostachuk on 7/28/17.
 */
public class MyPrintFile {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Parameter File name doesn't exist");
            return;
        }
        List<String> strings = new ArrayList<>();

        readFile(args[0]);
    }

    private static void readFile(String arg) {
        try (FileReader file = new FileReader(arg);
             BufferedReader buffReader = new BufferedReader(file)){

            String ss;
            while ((ss = buffReader.readLine()) != null) {
                System.out.println(ss);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
