package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstNPrimeNumbersMoreEfficient {

    // Challenge 5
    // Optimize the code of the FirstNPrimeNumbers.java file to make it more efficient.
    // The most efficient version of finding the first "n" prime numbers can be achieved
    // by implementing the Sieve of Eratosthenes algorithm. The Sieve of Eratosthenes is
    // an efficient algorithm for finding all prime numbers up to a specified integer.
    // By using this algorithm, we can significantly reduce the number of divisions needed
    // to determine if a number is prime.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number to set the quantity of prime numbers to display: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        List<Integer> primeNumbers = findFirstNPrimeNumbers(n);

        displayPrimeNumbers(primeNumbers);
    }

    public static List<Integer> findFirstNPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        boolean[] isPrime = new boolean[3 * n]; // Boolean array isPrime to track whether a number is prime or not

        for (int i = 2; i < isPrime.length && primeNumbers.size() < n; i++) {
            if (!isPrime[i]) {
                primeNumbers.add(i);
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        return primeNumbers;
    }

    public static void displayPrimeNumbers(List<Integer> primeNumbers) {
        System.out.println("The first " + primeNumbers.size() + " prime numbers are: ");
        System.out.println(primeNumbers);
    }
}
