package poi;



import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class ListFilesEx {
public static void main(String[] args) {
        
        File myDir = new File("/home/janbodnar/tmp");
        
        Collection<File> files = FileUtils.listFiles(myDir, 
                new String[] {"txt", "html"}, true);
        
        files.stream().forEach(System.out::println);
    }

}
