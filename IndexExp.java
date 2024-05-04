package com.javaBasicClasses;

public class IndexExp {
    public static void main(String[] args) {
        String str = "I love Java Programming";
//        int i = str.indexOf("Java");

        int i = str.indexOf("Python");

//        int i = str.indexOf("P");
//        int i = str.indexOf("s");
//        int i = str.indexOf('a', 12);
//        int i = str.indexOf('a');

//        int i = str.indexOf("Java",3);

//        int i = str.indexOf('a', 3);



        System.out.println(i);

        if (i !=-1){
            System.out.println("Items not found");
        }else {
            System.out.println("Items not found");
        }
    }
}
