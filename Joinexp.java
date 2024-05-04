package com.javaBasicClasses;

import java.util.ArrayList;

public class Joinexp {
    public static void main(String[] args) {
        String result1= String.join("-", "Arun","Varun","Dew");

        System.out.println(result1);

        String [] arr = {"Orange","Yellow","Green"};
        String result2= String.join(":",arr);
        System.out.println(result2);

        ArrayList<String> a1= new ArrayList<>();

        a1.add("Monday");
        a1.add("Tuesday");
        a1.add("Wednesday");
        a1.add("Thursday");


        String result3 = String.join(",", a1);

        System.out.println(result3);

    }
}
