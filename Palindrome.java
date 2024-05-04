package com.javaBasicClasses;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPal("anna"));
        System.out.println(isPal("MadAm"));
        System.out.println(isPal("civic"));
        System.out.println(isPal("apple"));
    }

    // frist algo
    public static boolean isPal(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return str.equals(rev.toString());
    }

    // second algo
//    public static boolean isPal(String str) {
//        int start = 0;
//        int end = str.length() - 1;
//        while (start < end) {
//
//            if (str.charAt(start) != str.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//
//        }
//        return true;
//    }

}
