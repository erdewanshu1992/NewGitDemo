package com.javaBasicClasses;


public class UpperStarTrianglePattern {

    // Method 1
    // To print upper part of the pattern
    private static void displayUpperPart(int size) {
        // Declaring variables for rows and columns
        int m, n;
        // Outer loop for rows
        for (m = size - 1; m >= 0; m--) {
            // Inner loop 1
            for (n = 0; n < m; n++) {
                // Printing whitespace
                System.out.print(" ");
            }
            // Inner loop 2
            for (n = m; n <= size - 1; n++) {
                // Printing star with whitespace
                System.out.print("*" + " ");
            }
            // By now we are done with one row so new line
            System.out.println();
        }
    }

    // Method 2
    // To print lower part of the pattern
    private static void displayLowerPart(int size) {
        // Declaring variables for rows and columns
        int m, n;
        // Outer loop for rows
        for (m = 1; m <= size; m++) {
            // Inner loop 1
            for (n = 1; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }
            // Inner loop 2
            for (n = m; n <= size; n++) {
                // Printing star and whitespace
                System.out.print("*" + " ");
            }
            // By now we are done with one row so new line
            System.out.println();
        }
    }
    // Method 3
    // Main driver method
    public static void main(String[] args) {
        // Declaring and initializing variable to
        // size of the triangle
        int size = 7;
        // Calling Method 1 to
        // display the upper part
        displayUpperPart(size);

        // Calling Method 2 to
        // display lower part
        displayLowerPart(size);
    }
}

