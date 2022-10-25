import java.io.*;
import java.util.Scanner;

public class WritingTxtFile {
    public static void writingTxtFile() throws IOException {


        Scanner scanner = new Scanner(System.in);
        String txt, answerAdd,answerOvw;

        System.out.println("Do you want to add text to existing file?");
        answerOvw = scanner.nextLine();
        String result = (answerOvw.equals("y"))? "Let's start" : "I'll overwrite existing file";
        System.out.println(result);

        File output = new File("output.txt");
            try (FileWriter out = new FileWriter(output,answerOvw.equals("y"))) {
            //try (FileWriter out = new FileWriter("d:\\\\jdk-19\\\\learning\\\\program.txt",answerOvw.equals("y"))) {
            do {
                System.out.println("Write text:");
                txt = scanner.nextLine();
                out.append("\n" + txt);
                System.out.println("Do you want to add more text? y/n");
                answerAdd = scanner.nextLine();

            } while (answerAdd.equals("y"));
        }
    }
}
