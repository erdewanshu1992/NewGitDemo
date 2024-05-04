package com.javaBasicClasses;

public class Minimum {
    public static void main(String[] args) {
        int array [] = {5,7,2,9,10,1,1,1,7};
        int min = array[0];
        for (int i =0; i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
