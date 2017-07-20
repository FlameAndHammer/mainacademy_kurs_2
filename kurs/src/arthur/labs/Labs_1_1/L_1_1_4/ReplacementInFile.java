package arthur.labs.Labs_1_1.L_1_1_4;

import java.io.*;
import java.util.Scanner;
/**
 * Created by arthk on 19.07.2017.
 * Write a class called ReplacementInFile whose main(String[] args) method read the source code
 * of any Java-program and replaces all the words public on  private.
 * The file name must be entered from the keyboard.
 */
public class ReplacementInFile {

    public static void main(String[] args) {
        // Read file from from the keyboard
        System.out.println("Input a file path");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();


        FileReader fileReader;
        FileWriter fileWriter;
        String fileContent = "";

        // record to fileContent in RAM
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            while(s != null){
                fileContent +=  s+"\n";
                s = bufferedReader.readLine();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

             // replacement in RAM
        fileContent = fileContent.replace("public", "private");

             // record on hard drive
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
