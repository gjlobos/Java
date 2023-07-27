package com.company;

public class Main {

    public static void main(String[] args) {

        Integer valor = 0;
        //Integer num = new Integer(1); // The constructor is deprecated
        Integer num = 1;
        Integer otherNum; // If a value is not assigned, the default value is null

        System.out.println("Valor: " + valor);
        System.out.println("Num: " + num);
        //System.out.println(otherNum); // Error: variable not initialized

        // Using classes to check the relation between two integer numbers
        Integer value1 = 10;
        Integer value2 = 30;
        int compare;

        if (value1.equals(value2))
            System.out.println("The values are equal");
        else {
            compare = value1.compareTo(value2);
            if (compare > 0)
                System.out.println("Value1 is greater than value2");
            else
                System.out.println("Value2 is greater than value1");
        }

        // In this code, we've refactored the previous version to make it simpler and more
        // efficient. In Java, since version 5, autoboxing and unboxing were introduced,
        // allowing automatic conversion between primitive types (like int) and their
        // corresponding wrapper class objects (like Integer). This means that we can
        // directly compare two Integer objects as if they were int.
        Integer value3 = 10;
        Integer value4 = 30;

        if (value3.equals(value4)) {
            System.out.println("The values are equal");
        } else if (value3 > value4) {
            System.out.println("Value3 is greater than value4");
        } else {
            System.out.println("Value4 is greater than value3");
        }


    }
}
