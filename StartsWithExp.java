package com.javaBasicClasses;

public class StartsWithExp {
    public static void main(String[] args) {


        String str = "My name is Dew";
        boolean b = str.startsWith("My");

        if (b) {
            System.out.println("Given text starts with My");
        } else {
            System.out.println("Given text not starting with required text");
        }
    }

}
