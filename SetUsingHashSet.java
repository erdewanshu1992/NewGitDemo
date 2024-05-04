package com.javaBasicClasses;

import java.util.HashSet;
import java.util.Set;

public class SetUsingHashSet {

        public static void main(String[] args) {
            // Create a Set (HashSet)
            Set<String> set = new HashSet<>();

            // Add elements to the Set
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("Banana"); // Duplicate element - will not be added

            // Iterate over the elements of the Set
            for (String fruit : set) {
                System.out.println(fruit);
            }
        }
    }

