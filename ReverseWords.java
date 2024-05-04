package com.javaBasicClasses;

public class ReverseWords {
    public static void main(String[] args){
        System.out.println(revWords("Dew Ji"));
        System.out.println(revWords("orange"));
        System.out.println(revWords("yes madam"));
    }

    public static String revWords(String str){

        StringBuilder rev = new StringBuilder();
        String[] words = str.split(" ");

        for (int i=words.length-1;i>=0;i--){
            rev.append(words[i]).append(" ");
        }
        return rev.toString().trim();
    }
}
