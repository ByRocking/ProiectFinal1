import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyLogging{
    static void scrieLogging(String string) throws IOException {
        File file = new File("Logging.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(string + '\n');
        pw.close();
        System.out.println(string);
    }
}
