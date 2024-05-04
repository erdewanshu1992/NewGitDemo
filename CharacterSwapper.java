package com.javaBasicClasses;

public class CharacterSwapper {
    public static void main(String[] args) {
        String text = "ABC";
        System.out.println("After swipe : " + swapingChar(text));
    }

        private static String swapingChar (String s) {
            // Convert the string to a character array
            char[] cA = s.toCharArray();

            // Swap characters without using a third variable
            int length = s.length();
            for (int i = 0; i < length - 1; i += 2) {
                // Swap charArray[i] and charArray[i+1]
                cA[i] = (char) (cA[i] ^ cA[i + 1]);
                cA[i + 1] = (char) (cA[i] ^ cA[i + 1]);
                cA[i] = (char) (cA[i] ^ cA[i + 1]);
            }

            // Convert the character array back to a string
            String swappedText = new String(cA);

//            System.out.println("Original text: " + s);
//            System.out.println("Swapped text: " + swappedText);
            return swappedText;
        }
    }


