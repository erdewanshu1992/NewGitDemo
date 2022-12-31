package javaBasic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
	 private List<Integer> list;
	    private static final int SIZE = 10;

	    public ListOfNumbers () {
	        list = new ArrayList<Integer>(SIZE);
	        for (int i = 0; i < SIZE; i++) {
	            list.add(new Integer(i));
	        }
	    }

	    public void writeList() throws IOException {
		// The FileWriter constructor throws IOException, which must be caught.
	        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

	        for (int i = 0; i < SIZE; i++) {
	            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	        out.close();
	    }

}
