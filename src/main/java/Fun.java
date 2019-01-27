import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Paths;

public class Fun {
    public static void main(String[] args) throws IOException {
        File destinationDir = new File(Paths.get(".").toAbsolutePath().normalize().toString());
        System.out.println(destinationDir.getAbsolutePath());
        File textFile = new File(destinationDir,"test.txt");
        FileUtils.writeStringToFile(textFile,"This is a test!!!");
    }
}
