package poi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class WriteFileEx {
	public static void main(String[] args) throws IOException {

        String string = "Today is a gloomy day.";
        File myfile = new File("src/main/resources/myfile.txt");
        
        FileUtils.writeStringToFile(myfile, string, 
                StandardCharsets.UTF_8.name());
        
        List<String> lines = new ArrayList<>();
        lines.add("A dark forest.");
        lines.add("A stray dog.");
        lines.add("A massive mountain.");
        
        File myfile2 = new File("src/main/resources/myfile2.txt");
        
        FileUtils.writeLines(myfile2, 
                StandardCharsets.UTF_8.name(), lines);
    }

}
