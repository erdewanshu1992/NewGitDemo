package com.javaBasicClasses;

import java.util.*;
public class CharacterDuplicate {
        public static void main(String[] args) {
            String text = "google";
            System.out.println(removeDuplicate(text));
        }

        private static String removeDuplicate(String s) {
            // Convert the string to a char array
            char[] ch = s.toCharArray();

            Set<Character> set = new HashSet<>();
            StringBuilder unique = new StringBuilder();

            for (char c : ch) {
                if (set.add(c)) {
                    unique.append(c);
                }
            }

            return unique.toString();
        }
    }

