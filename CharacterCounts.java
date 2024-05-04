package com.javaBasicClasses;

public class CharacterCounts {
//    public static void main(String[] args) {
//        String s="The Ram";
//        int count =0;
//        for(int i=0; i<s.length(); i++){
//            //if (s.charAt(i)!=' '){
//                count++;
//            //}
//        }
//        System.out.println(count);
//    }

        public static void main(String[] args) {
            String x = "Hello World";
            System.out.println("The counts are : "+doCount(x));
        }

        public static int doCount(String x) {
            int count = 0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != ' ') { // Compare to ' ', not 0
                    count++;
                }
            }
            return count;
        }

}
