package com.company;

public class Main {
    public static void main(String[] args) {
        //for loop example
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println(" ");

        //Control Structures example
        //Define two integers. Assign a value to each. Check if a number is
        //divisible by the second and indicate by means of a message the result obtained.
        //NOTE: That it is divisible means that when divided it gives an exact value, that is, without
        //decimals.
        int entero1;
        int entero2;
        int resto;
        String mensaje;
        String esDivisibleONo = " es divisible por ";

        entero1 = 10;
        entero2 = 5;
        resto = entero1%entero2;
                
        if(resto == 0) {
            esDivisibleONo = " es divisible por ";
            mensaje = "El resto es = "+resto+". El "+entero1+esDivisibleONo+entero2;
            System.out.println(mensaje);
        } else {
            esDivisibleONo = " no es divisible por ";
            mensaje = "El resto es = "+resto+". El "+entero1+esDivisibleONo+entero2;
            System.out.println(mensaje);
        }


    }
}
