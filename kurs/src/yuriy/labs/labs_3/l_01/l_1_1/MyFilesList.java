package yuriy.labs.labs_3.l_01.l_1_1;

import java.io.File;

/**
 * Created by Ruble on 20.07.2017.
 */
public class MyFilesList
{
    //static String[] args = {"D:\\Main_Academy\\prog\\mainacademy_kurs_2\\kurs\\src\\yuriy\\labs\\labs_3\\"};
    public static void main(String[] args )
    {
        String path;


        if (args.length == 0) {   path = new File("").getAbsolutePath();; }
        else { path = args[0];}

        File myFile = new File (path);

        File[] listFiles = myFile.listFiles();

        for (File file : listFiles) {
            if(file.isDirectory()){

                System.out.println("Directory \t" + file.getName() );
            }
            else{

                System.out.println("File     \t" + file.getName());
            }
        }





        //System.out.println(args [0]);


        //System.out.println();
        //File[] listFiles;
        //File.list();
/*
        File my = new File("D:\\Main_Academy\\prog\\mainacademy_kurs_2\\kurs\\src\\yuriy\\labs\\labs_3\\l_01\\ttt.txt");

        boolean isDir = my.isDirectory();
        if (isDir == true)
        {
            System.out.println("folder");
        }
        else
            {
                System.out.println("file");
            }
            */


/*

        System.out.println(my.getAbsolutePath());
        System.out.println(my.getName());
        try {
            my.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


*/
/*

        System.out.println(my.getName());
        System.out.println(my.getAbsoluteFile());

*/

        //System.out.println(my.);

    }
}
