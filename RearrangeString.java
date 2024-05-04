package com.javaBasicClasses;

public class RearrangeString {
    public static void main(String[] args) {
        String str = "interview";

        // Get the length of the string
        int length = str.length();

        // Extract substrings based on indices and concatenate them in the desired order
        String rearrangedString = str.substring(length - 4) + str.substring(0, length - 4);

        // Print the rearranged string
        System.out.println(rearrangedString);
    }
}

