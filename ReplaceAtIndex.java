package com.javaBasicClasses;

public class ReplaceAtIndex {
    public static void main(String[] args) {
        String s = "hey ram";

        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Check if the string length is at least 5 characters (to ensure index 3 and index 4 exist)
        if (charArray.length >= 5) {
            // Replace character at index 3 with character at index 4
            charArray[3] = charArray[4];
        }

        // Create a new string from the modified character array
        String replacedString = new String(charArray);

        // Print the resulting string
        System.out.println(replacedString);
    }
}
