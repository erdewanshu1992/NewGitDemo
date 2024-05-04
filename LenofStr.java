package com.javaBasicClasses;

public class LenofStr {

    public static void main(String[] args) {
        String str = "This is my Friend Dew!";

        int i =8;

        System.out.println("Count/length of String is: "+str.length());
        System.out.println("Concat String : "+str.concat(str+(' ' +("ram"))));
        System.out.println("Lower case String is: "+str.toLowerCase());
        System.out.println("Upper case String is: "+str.toUpperCase());
        System.out.println("Index of String is: "+str.charAt(i));
        // Replace "This is my Friend Dew!" with "shyam is my friend"
        String replacedString = str.replace("This is my Friend Dew!", "shyam is my friend");
        System.out.println("The new string is : "+replacedString);





    }

}
