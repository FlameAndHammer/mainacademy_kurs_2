package arthur.labs.Labs_1_1.L_1_1_4;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Created by arthk on 20.07.2017.
 */
public class Java7Replacement {

    public static void main(String[] args) {

        Path path = Paths.get("D:\\Test.java");
        Charset charset = StandardCharsets.UTF_8;

        String content = null;
        try {
            content = new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (content != null)  content = content.replaceAll("public", "private");

        try {
            if (content != null)    Files.write(path, content.getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
