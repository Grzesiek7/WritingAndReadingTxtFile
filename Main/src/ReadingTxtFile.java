import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingTxtFile {
    public static String readingTxtFile() throws IOException {
        //String content = Files.readString(Path.of("d:\\jdk-19\\learning\\program.txt"));
        File output = new File("output.txt");
        String content = Files.readString(output.toPath());
        return(content);
    }
}
