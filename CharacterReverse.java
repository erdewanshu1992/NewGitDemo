package com.javaBasicClasses;

public class CharacterReverse {
    public static void main(String[] args){

        String x ="apple";
////        System.out.println(revStr("apple"));//elppa
        System.out.println(revStr(x));//elppa
//
////        System.out.println(revStr("john"));//nhoj
////        System.out.println(revStr("phone"));//enohp
////        System.out.println(revStr("1234567"));//7654321

//        String[] x = {"apple", "phone", "1234"};
//        System.out.println(revStr("apple")); // elppa
//        System.out.println(revStr(x[2])); // elppa
//
//        System.out.println(revStr("john")); // nhoj
//        System.out.println(revStr("phone")); // enohp
//        System.out.println(revStr("1234567")); // 7654321
    }

    private static String revStr(String str) {
        String s = "";
        for (int i = str.length()-1;i>=0;i--){
            s = s+ str.charAt(i);
        }
        return s;
    }
}
