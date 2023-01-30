package TextFile_Operations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort_lines {

    public static void main(String[]args) throws IOException {


        File file = new File("E:\\Automation Workspace\\Java programs\\LICENSE.txt");
        List<String> list = FileUtils.readLines(file,"UTF-8");
        Collections.sort(list);
        FileUtils.write(file,"","UTF-8",false);

        for(String x: list){

            System.out.println(x);
        }



    }



}
