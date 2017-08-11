package arthur.labs.Labs_1_1.L_1_1_1;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by arthk on 18.07.2017.
 * Write a class called MyFilesListPro whose main(String[] args) method prints to standard out the files/directories contained in
 * 1. the current directory if no args[0] specified, or,
 * 2. the directory mentioned in args[0]. Don't worry about formatting the output; just print one file or directory name
 * per output line.
 */
public class MyFilesListPro {
    public static void main(String[] args) {
        // check param gotten from cmd
        if(args.length == 0){
            File homeDirectory =// new File(".");
                    new File(Paths.get(".").toAbsolutePath().normalize().toString());
            myListFiles(homeDirectory);
        }else{
            myListFiles(new File(args[0]));
        }

    }


    public static void myListFiles(File f){
        File[] files = f.listFiles();
        for(File file: files){

            if(file.isDirectory()){ // checking folder for files inside it by recursion
                System.out.println("Folder: " + file.getName()); // print folder name
                myListFiles(file);
            }
            else {
                System.out.println("File: " + file.getName()); // print file name

            }
        }
    }
}
