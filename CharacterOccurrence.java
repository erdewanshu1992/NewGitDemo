package com.javaBasicClasses;

import java.util.HashMap;

public class CharacterOccurrence {
    public static void main(String[] args) {

        String input = "my name is dewanshu";
        System.out.println("Counts occurance of  : " + checkOccurence(input));

    }

    private static String checkOccurence(String s) {
        HashMap<Character, Integer> occurrences = new HashMap<>();

        // Counting occurrences of each character
        for (char c : s.toCharArray()) {
            if (occurrences.containsKey(c)) {
                occurrences.put(c, occurrences.get(c) + 1);
            } else {
                occurrences.put(c, 1);
            }
        }
        // Printing occurrences
        for (char c : occurrences.keySet()) {
            if (c == ' ') {
                System.out.println("Occurrence of space : " + occurrences.get(c));
            } else {
                System.out.println("Occurrence of " + c + " : " + occurrences.get(c));
            }
        }
        return s;
    }
}
