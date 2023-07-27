package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Exercise Calculator
        // Let's create our first functions
        // We have the Calculator class that for now will only work with
        // our primitive type int.
        // We have to create four functions for our calculator add,
        // subtract, divide and multiply

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second integer: ");
        int num2 = scanner.nextInt();


        System.out.println("The sum of "+num1+" and "+num2+" equals = "+sum(num1, num2));
        System.out.println("The substraction of "+num1+" and "+num2+" equals = "+substract(num1, num2));
        System.out.println("The multiplication of "+num1+" and "+num2+" equals = "+multiply(num1, num2));
        System.out.println("The division of "+num1+" and "+num2+" equals = "+divide(num1, num2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
