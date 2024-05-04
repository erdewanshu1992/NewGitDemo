package com.javaBasicClasses;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Cleanup code
            System.out.println("This code always runs, regardless of whether an exception occurred or not.");
        }
/*
Input: “I AM in TSYS”
Write a generic way so that I get output as “I AM in TSYS”.
 */
        String str = "I AM in TSYS";
        System.out.println(str.replaceAll("\\s+", "").trim());


        /*
        int[] int_Array={1,9,8,19,4,1……………1000 items};
Which 3 consecutive no. are there in the Array has maximum sum?
1,2,3 _ 2,3,4 _ 3,4,5 _ ….
         */
        int[] intArray = {1, 9, 8, 19, 4, 1 /* add remaining numbers up to 1000 */};

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = 0;

        // Iterate through the array to find the maximum sum
        for (int i = 0; i < intArray.length - 2; i++) {
            int sum = intArray[i] + intArray[i + 1] + intArray[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        // Print the three consecutive numbers with maximum sum
        System.out.println("Three consecutive numbers with maximum sum:");
        System.out.println(intArray[maxIndex] + ", " + intArray[maxIndex + 1] + ", " + intArray[maxIndex + 2]);

        
        // Write a Program to find whether String is Palindrome or not

        String strP = "MaDam";
        String rev = "";
        int length = strP.length();
        for (int i = length-1; i >= 0; i--)
        rev = rev + strP.charAt(i);
        if (strP.equals(rev))
            System.out.println(strP + " is a palindrome");
        else
            System.out.println(strP + " is not a palindrome");

    }
}
