package com.javaBasicClasses;

public class PrintSquareStarPattern {

    // Java Program to Print Square Pattern
        // Case 1: Hollow rectangle
        // Method 1
        // To print hollow rectangle
        static void print_rectangle(int k, int l) {
            int a, b;

            // Nested for loops for iterations

            // Outer loop for rows
            for (a = 1; a <= k; a++) {
                // Inner loop for columns
                for (b = 1; b <= l; b++) {
                    // Condition check using logical OR operator
                    // over rows and columns positions
                    // if found at circumference of rectangle
                    if (a == 1 || a == k || b == 1 || b == l)

                        // Print the star pattern
                        System.out.print("*");
                    else

                        // Rest inside square print the empty
                        // spaces
                        System.out.print(" ");
                }

                // By now we are done with only 1 row so
                // New line
                System.out.println();
            }
        }

        // Method 2
        // Main driver method
        public static void main(String args[])
        {
            // Declaring and initializing rows and columns
            // For square row = columns

            // Custom input initialization values
            int rows = 8, columns = 22;

            // Calling the method1 to print hollow rectangle
            // pattern
            print_rectangle(rows, columns);
        }
    }

