package olena.labs.Lab_3_1_1;

import java.io.File;

/**
 * Created by elenafostachuk on 7/28/17.
 */
public class MyFilesList {
    public static void main(String[] args) {
        File homeDir = new File("C:\\Documents\\mainacademy_kurs_2\\kurs\\src\\olena");
        File[] files = homeDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}

