package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "John";
        char firstLetter;
        char secondLetter;

        int length = name.length();
        System.out.println("The length of the name is " + length);

        name = name.toUpperCase();

        if (name.equals("JOHN")) {
            System.out.println("The name has been changed to uppercase");
        }

        firstLetter = name.charAt(0);
        secondLetter = name.charAt(1);
        System.out.println("The first letter is " + firstLetter);
        System.out.println("The second letter is " + secondLetter);
    }
}
