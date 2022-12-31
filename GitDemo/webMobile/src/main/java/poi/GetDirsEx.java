package poi;

import org.apache.commons.io.FileUtils;

public class GetDirsEx {
public static void main(String[] args) {
        
        String tempDir = FileUtils.getTempDirectoryPath();
        System.out.println(tempDir);
        
        String userDir = FileUtils.getUserDirectoryPath();
        System.out.println(userDir);
    }

}
