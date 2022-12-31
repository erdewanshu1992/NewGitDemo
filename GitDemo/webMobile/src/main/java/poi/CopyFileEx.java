package poi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFileEx {
public static void main(String[] args) throws IOException {
        
        File myfile1 = new File("src/main/resources/myfile.txt");
        File myfile2 = new File("src/main/resources/myfile2.txt");
        
        FileUtils.copyFile(myfile1, myfile2);
        
        if (FileUtils.contentEquals(myfile1, myfile2)) {
            
            System.out.println("The files have equal content");
        } else {
            
            System.out.println("The files do not have equal content");
        }
        
        File docs = new File("src/main/resources/docs");
        FileUtils.forceMkdir(docs);
        
        FileUtils.copyFileToDirectory(myfile2, docs);
    }

}
