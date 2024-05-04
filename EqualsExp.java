package com.javaBasicClasses;

public class EqualsExp {

    public static void main(String[] args) {
        String str1= "Ram";
        String str2="Shyam";
        String str3="Ram";
        String str4="ram";

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//true
    }
}
