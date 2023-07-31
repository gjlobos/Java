package com.company;

import java.util.Scanner;

public class PetsFoodDistribution {

    // Challenge 1
    // At the vet they have dogs of different types. Each of them
    // eats a fixed amount of balanced food per day. The food
    // supplier sends you a pack with different amounts of food.
    // In each one there are envelopes with small portions to be
    // consumed for each day, knowing that they must give them at
    // least 3 kg per day so that each dog does not feel hungry and
    // bark all night.
    // We need to make a program that will help us simulate the
    // situation: It will first ask for the name and the amount of
    // food the dog eats. The idea is that through a function called
    // howManyPackages indicates the name and how many packages it
    // will use. Given the amount needed, function howManyPackages
    // will request the weights of each package one by one until
    // reaching that quantity and returns the number of packages
    // he specified.
    // Example:
    // Rintintin eats 4 kg daily.
    // Packages : 1.2 0.7 1.1 1.3
    // Result: Rintintin needs 4 packages.

    public static void main(String[] args) {

        // Ask for the pet's name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet's name:");
        String petName = scanner.next();

        // Ask how many kgs of food it requires
        System.out.println("Enter the amount of food in kgs that your pet needs:");
        Double kgsFood = scanner.nextDouble();

        // Start giving food packets and show the result
        Integer packages = howManyPackages(kgsFood); //Here the method that calculates how many packages are needed is called
        System.out.println("The number of packages it took to feed "+petName+" were: "+packages);
    }

    public static Integer howManyPackages(Double foodQuantity) {
        // Code to calculate how many packages of food the pet needs
        Scanner scanner = new Scanner(System.in);
        Double foodQuantityConsumed = 0.0;
        Integer packagesQuantity = 0;
        while (foodQuantityConsumed < foodQuantity) {
            System.out.println("Enter the amount of foodQuantity in kgs that the package has:");
            Double foodQuantityOnePackage = scanner.nextDouble();
            foodQuantityConsumed += foodQuantityOnePackage;
            packagesQuantity++;
        }
        return packagesQuantity;
    }
}
