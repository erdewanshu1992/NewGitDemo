package poi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CreateDeleteFileEx {
	 public static void main(String[] args) throws IOException {
	        
	        File myfile = new File("src/main/resources/myfile.txt");        
	        FileUtils.touch(myfile);
	        
	        if (myfile.exists()) {
	            
	            System.out.println("The file exists");
	        } else {
	            
	            System.out.println("The file does not exist");
	        }
	    /*    
	        FileUtils.deleteQuietly(myfile);
	        
	        if (myfile.exists()) {
	            
	            System.out.println("The file exists");
	        } else {
	            
	            System.out.println("The file does not exist");
	        }*/
	 }

}
