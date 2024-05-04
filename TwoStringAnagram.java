package com.javaBasicClasses;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("listen","silent"));
        System.out.println(isAnagram("triangle","integral"));
        System.out.println(isAnagram("abc","bca"));
        System.out.println(isAnagram("abc","ccb"));
        System.out.println(isAnagram("aaa","aaab"));
    }


    public static boolean isAnagram(String str, String str1){
        // convert both string into char[]
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] to array
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);
        return Arrays.equals(arrStr, arrStr1);
    }

}
