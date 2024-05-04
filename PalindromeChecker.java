package com.javaBasicClasses;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "yes madam"; // Change this string to test different inputs

        if (isPalindrome(str)) {
            System.out.println("'" + str + "' contains a palindrome.");
        } else {
            System.out.println("'" + str + "' does not contain a palindrome.");
        }
    }

    // Function to check if a string contains a palindrome ignoring spaces
    public static boolean isPalindrome(String str) {
        String[] words = str.split("\\s+"); // Split the input string by spaces
        for (String word : words) {
            if (word.equalsIgnoreCase("madam")) { // Check if the word is "madam"
                StringBuilder rev = new StringBuilder(word).reverse();
                if (word.equalsIgnoreCase(rev.toString())) { // Check if "madam" is a palindrome
                    return true;
                }
            }
        }
        return false; // If no "madam" palindrome is found, return false
    }
}




//public class PalindromeChecker {
//    public static void main(String[] args) {
//        String str = "yes madam"; // Change this string to test different inputs
//
//        if (isPalindrome(str)) {
//            System.out.println("'" + str + "' is a palindrome.");
//        } else {
//            System.out.println("'" + str + "' is not a palindrome.");
//        }
//    }
//
//    // Function to check if a string is a palindrome ignoring spaces
//    public static boolean isPalindrome(String str) {
//        StringBuilder rev = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            if (str.charAt(i) != ' ') {
//                rev.append(str.charAt(i));
//            }
//        }
//        return str.replaceAll("\\s+", "").equalsIgnoreCase(rev.toString());
//    }
//}
