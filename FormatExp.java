package com.javaBasicClasses;

public class FormatExp {

    public static void main(String[] args) {
        String name ="Dewanshu";
        int exprience = 6;

        String resultText = String.format("My name is %s and i have %d years experience ", name, exprience);
        System.out.println(resultText);
    }
}
