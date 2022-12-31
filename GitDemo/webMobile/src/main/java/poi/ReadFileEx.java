package poi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadFileEx {
public static void main(String[] args) throws IOException {
        
        File myfile = new File("src/main/resources/words.txt");
        
        String contents = FileUtils.readFileToString(myfile, 
                StandardCharsets.UTF_8.name());
        
        System.out.println(contents);
        
        List<String> lines = FileUtils.readLines(myfile, 
                StandardCharsets.UTF_8.name());
        
        System.out.printf("There are %d lines in the file\n", lines.size());
        
        System.err.printf("The second line is: %s", lines.get(1));
    }

}
