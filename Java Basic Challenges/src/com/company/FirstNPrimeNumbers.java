package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNPrimeNumbers {

    // Challenge 4
    // Implement a program that allows us to display the first "n" prime
    // numbers on the console, being "n" a numerical value entered by the
    // console.
    // For example, with n=7, what the program should return is:
    // “The first 7 prime numbers are: 2, 3, 5, 7, 11, 13, 17”.

    public static final int QUANTITY_OF_NUMBERS_TO_CHECK = 1000;

    public static void main(String[] args) {

        // Enter a value "n" through the console to define the number of
        // prime numbers to display

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number to set the quantity of prime numbers to display: ");
        int n = scanner.nextInt();

        // Validate that the value entered is greater than 0
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Call the function that finds the first "n" prime numbers
        int[] primeNumbers = findFirstNPrimeNumbers(n);

        // Call the function that displays the first "n" prime numbers
        displayPrimeNumbers(primeNumbers);

    }

    // Function that finds the first "n" prime numbers
    public static int[] findFirstNPrimeNumbers(int n) {
        int[] arrayPrimeNumbers = new int[n];
        int indexArrayPrimeNumbers = 0;

        for (int i = 1; i <= QUANTITY_OF_NUMBERS_TO_CHECK; i++) {
            int numberOfDivisibleNumbers = 0;
            for (int j = 1; j <= i; j++) {
                int rest = i % j;
                if (rest == 0) {
                    numberOfDivisibleNumbers++;
                }
            }

            if (numberOfDivisibleNumbers == 2) {
                arrayPrimeNumbers[indexArrayPrimeNumbers] = i;
                indexArrayPrimeNumbers++;
            }

            if (indexArrayPrimeNumbers == n) {
                break;
            }
        }

        return arrayPrimeNumbers;
    }

    // Function that displays the first "n" prime numbers
    public static void displayPrimeNumbers(int[] primeNumbers) {
        System.out.println("The first " + primeNumbers.length + " prime numbers are: ");
        System.out.println(Arrays.toString(primeNumbers));
    }

}
