import org.apache.commons.io.FileUtils;

import java.io.*;

public class Fun {
    public static void main(String[] args) throws IOException {
        File destinationDir = new File(new File(System.getProperty("user.dir")).getParentFile().getAbsolutePath());
        System.out.println(destinationDir.getAbsolutePath());
        File textFile = new File(destinationDir,"test.txt");
        FileUtils.writeStringToFile(textFile,"This is a test!!!");
    }
}
