package com.company;

public class Main {
    public static void main(String[] args) {
        // Ejercicio playground
        int numeroEntero = 10;
        double numeroConComa = 8.3;
        double suma = numeroEntero + numeroConComa;
        System.out.println(suma);

        //Ejercicio estructuras
        int entero1;
        int entero2;
        int resto;
        String mensaje;
        String esDivisibleONo = " es divisible por ";

        entero1 = 10;
        entero2 = 4;
        resto = entero1%entero2;
        mensaje = "El resto = "+resto+". El "+entero1+esDivisibleONo+entero2;

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
