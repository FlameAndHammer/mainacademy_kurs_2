package yuriy.labs.labs_3.l_01.l_1_3;

import java.io.*;

/**
 * Created by Ruble on 13.08.2017.
 */
public class MyFileCopy

       // "D:\Main_Academy\prog\mainacademy_kurs_2\kurs\src\yuriy\labs\labs_3\l_01\l_1_3\in.txt","D:\Main_Academy\prog\mainacademy_kurs_2\kurs\src\yuriy\labs\labs_3\l_01\l_1_3\out.txt"
        //"D:\in.txt";"D:\out.txt"

{
    public static void main(String[] args) throws IOException {
        if (args.length == 0)
        {
            System.out.println("Parameter File name doesn't exist");
            return;
        }
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        try
        {
            fileInput = new FileInputStream(args[0]);
            fileOutput = new FileOutputStream(args[1]);
            int c;
            while ((c = fileInput.read()) !=-1)
            {
                fileOutput.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            if (fileInput != null)
            {
                fileInput.close();
            }
            if (fileOutput != null)
            {
                fileOutput.close();
            }
        }
    }
}

