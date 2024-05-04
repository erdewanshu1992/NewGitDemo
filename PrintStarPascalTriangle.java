package com.javaBasicClasses;

public class PrintStarPascalTriangle {
    // Java Program to Print Pascal's Triangle
        // Method 1
        // Pascal function
        public static void printPascal(int k)
        {
            for (int line = 1; line <= k; line++) {
                for (int b = 0; b <= k - line; b++) {

                    // Print whitespace for left spacing
                    System.out.print(" ");
                }

                // Variable used to represent C(line, i)
                int C = 1;

                for (int a = 1; a <= line; a++) {

                    // The first value in a line is always 1
                    System.out.print(C + " ");

                    C = C * (line - a) / a;
                }

                // By now, we are done with one row so
                // a new line is required
                System.out.println();
            }
        }

        // Method 2
        // Main driver method
        public static void main(String[] args)
        {
            // Declare and initialize variable number
            // upto which Pascal's triangle is required on
            // console
            int n = 6;

            // Calling the Pascal function(Method 1)
            printPascal(n);
        }
    }

