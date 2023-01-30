package TextFile_Operations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Copying_TextFile {

    public static void main(String[]args) throws IOException {

        File file1 =  new File("E:\\Automation Workspace\\Java programs\\LICENSE.txt");
        File file2 =  new File("E:\\Automation Workspace\\Java programs\\LICENSE1.txt");
        File file3 =  new File("E:\\Automation Workspace\\Java programs\\LICENSE3.txt");
        File dir  = new File("E:\\Automation Workspace\\Java programs\\DummyDir");

        FileUtils.copyFile(file1,file2);
        FileUtils.copyFileToDirectory(file2,dir);
        FileUtils.moveFile(file2,file3);



    }
}
