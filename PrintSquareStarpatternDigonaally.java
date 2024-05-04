package com.javaBasicClasses;

public class PrintSquareStarpatternDigonaally {

    // Java Program to Print Square Star pattern
        // Case: Primary and secondary diagonal Rectangle Pattern
        // Method 1
        // To print square with primary and secondary diagonal
        static void print_squaredi(int k)
        {
            int a, b;

            // Nested 2 for loops for Matrix printing

            // Outer loop for rows
            for (a = 1; a <= k; a++) {
                // Inner loop for columns
                for (b = 1; b <= k; b++) {
                    // Condition check using OR operator where
                    // 1. Printing star as per first 4 checks
                    // on the circumference of rectangle
                    // 2. Fifth check is for diagonals
                    if (a == 1 || a == k || b == 1 || b == k
                            || a == b || b == (k - a + 1))

                        // Print the star pattern
                        System.out.print("*");
                    else

                        // Print the white spaces
                        System.out.print(" ");
                }

                // By now we are over with one row so
                // new line
                System.out.println();
            }
        }

        // Method 2
        // Main driver method
        public static void main(String args[])
        {
            // This time taking square so only one variable
            // needs to be declared
            // Custom input entry
            int rows = 12;

            // calling the method1 to print
            // square pattern with diagonal
            print_squaredi(rows);
        }
    }

