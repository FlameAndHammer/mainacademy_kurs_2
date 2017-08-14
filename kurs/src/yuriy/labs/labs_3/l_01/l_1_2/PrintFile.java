package yuriy.labs.labs_3.l_01.l_1_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ruble on 25.07.2017.
 */
public class PrintFile
{
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Parameter File name doesn't exist");
            return;
        }
        try ( FileReader file = new FileReader(args[0]);
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
