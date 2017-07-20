package arthur.labs.Labs_1_1.L_1_1_1;

import java.io.File;


/**
 * Created by arthk on 19.07.2017.
 * Write a class called MyFilesListPro whose main(String[] args) method prints to standard out the files/directories contained in
 *  the current directory .
 * Don't worry about formatting the output; just print one file or directory name
 * per output line.
 */

public class MyFilesList {
 public static void main(String[] args) {
  File homeDirectory = new File("E:\\Projects\\mainacademy_kurs_2\\kurs\\src\\arthur");
  File[] files = homeDirectory.listFiles();
  for (File file : files) {
   System.out.println(file.getName());
  }
 }
}

