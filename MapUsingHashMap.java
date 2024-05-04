package com.javaBasicClasses;

import java.util.HashMap;
import java.util.Map;

public class MapUsingHashMap {

    public static void main(String[] args) {

            // Create a Map (HashMap)
            Map<Integer, String> map = new HashMap<>();

            // Add key-value pairs to the Map
            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Orange");

            // Retrieve values from the Map
            System.out.println("Value for key 2: " + map.get(2));
            System.out.println("Map: " + map);
        }
    }


