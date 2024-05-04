package com.javaBasicClasses;

import java.util.HashMap;

public class HashMapExp {

        public static void main(String[] args) {
            // Create a HashMap
            HashMap<Integer, String> dis = new HashMap<>();

            // Add key-value pairs to the HashMap
            dis.put(1, "Apple");
            dis.put(2, "Banana");
            dis.put(3, "Orange");
            dis.put(4, "Orange");

            // Retrieve values from the HashMap
            System.out.println("Value for key 2: " + dis.get(2));
            System.out.println("HashMap: " + dis);
        }
    }

