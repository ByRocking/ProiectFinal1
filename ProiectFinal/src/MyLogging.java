import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogging{
    static FileWriter myWriter;
    public MyLogging() throws IOException {
        myWriter = new FileWriter("Logging.txt");
    }
    static void scrieLogging(String string) throws IOException {
        myWriter.append(string);
    }
}
