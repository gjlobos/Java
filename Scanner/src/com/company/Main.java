package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Example 1
        Scanner scanner;
        scanner = new Scanner(System.in);

        int age;
        String name;
        System.out.println("Input your name: ");
        name = scanner.nextLine();
        System.out.println("Input your age: ");
        age = scanner.nextInt();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

    }
}