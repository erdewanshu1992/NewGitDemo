package poi;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class ListFilesFilterEx {
public static void main(String[] args) {
        
        File myDir = new File("/home/janbodnar/tmp");
        
        Collection<File> files = FileUtils.listFiles(myDir, 
                new WildcardFileFilter("*.txt", IOCase.SENSITIVE),
                new NotFileFilter(DirectoryFileFilter.DIRECTORY));
        
        files.stream().forEach(System.out::println);
    }

}
