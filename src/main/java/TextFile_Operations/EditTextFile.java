package TextFile_Operations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class EditTextFile {

    public static void main(String[]args) throws IOException {

        File file =  new File("E:\\Automation Workspace\\Java programs\\LICENSE.txt");

        FileUtils.write(file,"EzhilRaj","UTF-8",true);


    }


}
