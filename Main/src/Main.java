import java.io.IOException;

public class Main {
    public static void main(String arg[]) throws IOException {
        ReadingTxtFile x = new ReadingTxtFile();
        WritingTxtFile y = new WritingTxtFile();


        y.writingTxtFile();
        System.out.println(x.readingTxtFile());
        System.out.println("Press Enter to quit");
        System.in.read();
    }
}