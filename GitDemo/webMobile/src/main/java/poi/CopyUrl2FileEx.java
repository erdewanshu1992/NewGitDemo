package poi;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class CopyUrl2FileEx {
public static void main(String[] args) throws IOException {
        
        URL myurl = new URL("http://www.something.com");
        
        File myfile = new File("src/main/resources/something.html");
        
        FileUtils.copyURLToFile(myurl, myfile);
        
        String content = FileUtils.readFileToString(myfile, 
                StandardCharsets.UTF_8.name());
        
        System.out.println(content);
    }

}
