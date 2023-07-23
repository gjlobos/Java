package com.company;

public class Main {
    public static void main(String[] args) {
        //for loop example
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println("");

        //Ejercicio estructuras playground
        int entero1;
        int entero2;
        int resto;
        String mensaje;
        String esDivisibleONo = " es divisible por ";

        entero1 = 10;
        entero2 = 4;
        resto = entero1%entero2;
        mensaje = "El resto = "+resto+". El "+entero1+esDivisibleONo+entero2;
        System.out.println(mensaje);
                

        if(resto == 0) {
            esDivisibleONo = " es divisible por ";
            mensaje = "El resto = "+resto+". El "+entero1+esDivisibleONo+entero2;
            System.out.println(mensaje);
        } else {
            esDivisibleONo = " no es divisible por ";
            mensaje = "El resto = "+resto+". El "+entero1+esDivisibleONo+entero2;
            System.out.println(mensaje);
        }
    }
}
