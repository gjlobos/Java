package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        // Make a function that given a number indicates if it is a prime
        // number or not. A prime number is one that can only be divided
        // by 1 and itself.
        // For example: 25 is not prime, since 25 is divisible by 1, 5,
        // and 25. 17 is prime because it can only be divided by 1 and 17.
        //
        // Use this function in a program, which allows the input of a
        // number and then calls the developed function to check if it is
        // prime or not. To solve it, use another function to check if a
        // number is divisible by another.
        // isDivisible(int n, int divisor)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }

        System.out.println(" ");



        // Exercise 2
        // Write a function that takes three numbers and returns the
        // maximum among the three numbers.
        //
        // Integer maximumBetweenThreeNumbers(Integer aNumberA,
        // Integer aNumberB, Integer aNumberC)
        //
        // Then make a program that allows the input of 3 values, use
        // the function and display the result.

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner2.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner2.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner2.nextInt();

        System.out.println("The maximum between the three numbers is: " + maximumBetweenThreeNumbers(num1, num2, num3));

        System.out.println(" ");

        // Exercise 3
        // Write a function:
        //
        // boolean distinctTextStrings(String aTextA, String aTextB)
        //
        // which should take two strings and return true, if they are
        // different, or false, if they match.

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter first text string: ");
        String text1 = scanner3.next();
        System.out.println("Enter second text string: ");
        String text2 = scanner3.next();

        Boolean result = true;
        result = distinctTextStrings(text1, text2);
        System.out.println(result);

    }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i < num; i++) {
                if (isDivisible(num, i)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isDivisible(int n, int divisor) {
            return n % divisor == 0;
        }

        public static int maximumBetweenThreeNumbers(int aNumberA, int aNumberB, int aNumberC) {
            int max = aNumberA;
            if (aNumberB > max) {
                max = aNumberB;
            }
            if (aNumberC > max) {
                max = aNumberC;
            }
            return max;
        }

        public static boolean distinctTextStrings(String aTextA, String aTextB) {
            if (aTextA.equals(aTextB)) {
                System.out.println("The text strings are the same");
                return false;
            } else {
                System.out.println("The text strings are different");
                return true;
            }
        }
}