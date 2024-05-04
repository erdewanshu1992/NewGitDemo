package com.javaBasicClasses;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[] = {5, 7, 5, 2, 9, 10, 1, 1, 1, 7};

        // Create a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add elements to the Set to remove duplicates
        for (int num : array) {
            uniqueElements.add(num);
        }

        // Print the unique elements
        System.out.println("Array without duplicates:");
        for (int uniqueNum : uniqueElements) {
            System.out.print(uniqueNum + " ");
        }
    }
}

//        int array[] = {5, 7, 2, 9, 10, 1, 1, 1, 7};
//
//        Set<Integer> set = new HashSet<>();
//        List<Integer> uniqueList = new ArrayList<>();
//
//        for (int num : array) {
//            if (set.add(num)) {
//                uniqueList.add(num);
//            }
//        }
//
//        // Convert the uniqueList back to an array if needed
//        int[] uniqueArray = uniqueList.stream().mapToInt(Integer::intValue).toArray();
//
//        // Print the unique array
//        System.out.println(Arrays.toString(uniqueArray));
//
//    }


