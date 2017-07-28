package olena.labs.Lab_3_1_1;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by elenafostachuk on 7/28/17.
 */
public class MyFileListPro {
    public static void main(String[] args) {
        if (args.length == 0) {
            File homeDir = new File(Paths.get(".").toAbsolutePath().normalize().toString());
            MyDirFiles(homeDir);
        } else MyDirFiles(new File(args[0]));
    }

    public static void MyDirFiles(File f) {
        File[]files =f.listFiles();
        for (File file:files){
            if(file.isDirectory()){
                System.out.println(file.getName());
                MyDirFiles(file);
            }
            System.out.println(file.getName());
        }
    }
}
