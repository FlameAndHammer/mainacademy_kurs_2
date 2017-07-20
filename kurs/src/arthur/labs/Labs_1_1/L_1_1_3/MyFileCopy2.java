package arthur.labs.Labs_1_1.L_1_1_3;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by arthk on 20.07.2017.
 *  Write a class called MyFileCopy whose main(String[] args)
 * method copies one file (could be binary!) to another
 *
 */
public class MyFileCopy2 {
    public static void main(String[] args) throws IOException {
        copyFileUsingJava7Files(new File ("D:\\text.txt" ),
                new File ("D:\\Newtext.txt"));
    }


    private static void copyFileUsingJava7Files(File source, File dest)
            throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

}
