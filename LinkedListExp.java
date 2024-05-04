package com.javaBasicClasses;

import java.util.LinkedList;

public class LinkedListExp {

        public static void main(String[] args) {
            // Create a LinkedList
            LinkedList<String> dis = new LinkedList<>();

            // Add elements to the LinkedList
            dis.add("Apple");
            dis.add("Banana");
            dis.add("Orange");

            // Add an element at a specific position
            dis.add(1, "Mango");

            // Remove an element
            dis.remove("Banana");

            // Iterate over the elements of the LinkedList
            for (String fruit : dis) {
                System.out.println(fruit);
            }
        }
    }

