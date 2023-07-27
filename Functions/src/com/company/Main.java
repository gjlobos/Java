package com.company;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        // Create a function that takes two values as parameters and
        // returns a boolean. The function should check if the first
        // number is divisible by the second.
        // boolean isDivisible(int n, int divisor)
        // NOTE: That it is divisible means that when divided it gives
        // an exact value, that is, without decimals.

        int num1 = 10;
        int num2 = 3;

        System.out.println(isDivisible(num1, num2));

        int num3 = 10;
        int num4 = 2;

        System.out.println(isDivisible(num3, num4));
    }

    public static boolean isDivisible(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    } // if statement is not necessary, but it makes the code more readable.
      // return n % divisor == 0;
}