package com.javaBasicClasses;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(29));
        System.out.println(isPrime(35));
        System.out.println(isPrime(2));
        System.out.println(isPrime(9));
    }


    public static boolean isPrime(int num){
        for (int i = 2;  i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
