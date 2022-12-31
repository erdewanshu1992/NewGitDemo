package poi;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class GetFileSizeEx {
public static void main(String[] args) {
        
        File myfile = new File("/home/janbodnar/tmp/rotunda.jpg");
        
        long fileSizeB = FileUtils.sizeOf(myfile);
        System.out.printf("The size of file is: %d bytes\n", fileSizeB);
        
        File mydir = new File("/home/janbodnar/tmp");
        
        long dirSizeB = FileUtils.sizeOfDirectory(mydir);
        double dirSizeKB = (double) dirSizeB / FileUtils.ONE_KB;
        double dirSizeMB = (double) dirSizeB / FileUtils.ONE_MB;
        
        System.out.printf("The size of directory is: %d bytes\n", dirSizeB);
        System.out.printf("The size of file is: %.2f kilobytes\n", dirSizeKB);
        System.out.printf("The size of file is: %.2f megabytes\n", dirSizeMB);        
    }

}
