package com.company;

public class Main {
    public static void main(String[] args) {

        // Create a new instance array of 5 integers
        String[] names = new String[5];

        // We can traverse the array using a for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // We can define the values of the array at the time of declaration
        names[0] = "Juan";
        names[1] = "Mario";
        names[2] = "Carlos";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // We can print one element of the array using its index
        System.out.println(names[0]);

        // If we try to access an index that does not exist, we will get an exception
        //System.out.println(names[7]);

        // We can traverse the array using a for loop
        for(int i = 0; i<names.length; i++)
            System.out.println(names[i]);

        // We can traverse the array using a while loop
        int i = 0;
        while(i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        // We can traverse the array using a for each loop
        for(String name : names)
            System.out.println(name);
        
    }
}