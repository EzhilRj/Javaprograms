package TextFile_Operations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[]args) throws IOException {

        File file =  new File("E:\\Automation Workspace\\Java programs\\LICENSE.txt");

        String x = FileUtils.readFileToString(file,"UTF-8");

        System.out.println(x);

    }
}
