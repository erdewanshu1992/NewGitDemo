package com.javaBasicClasses;

import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        // Object[] array = {5, "a", "a", "a", "a", "v", "v", "s", "g", 7, 2, 9, 10, 1, 1, 1, 7, "radhika", "rekha", "radhika"};
        // Object[] array = { "a", "a", "a", "a", "v", "v", "s", "g"};
        // Object[] array = {5, 7, 2, 9, 10, 1, 1, 1, 7};
        Object[] array = {"radhika", "rekha", "radhika"};

        Set<Object> set = new HashSet<>();
        List<Object> uniqueList = new ArrayList<>();

        for (Object element : array) {
            if (set.add(element)) {
                uniqueList.add(element);
            }
        }
        // Convert the uniqueList back to an array if needed
        Object[] uniqueArray = uniqueList.toArray(new Object[0]);

        // Print the unique array
        System.out.println(Arrays.toString(uniqueArray));
    }
}

