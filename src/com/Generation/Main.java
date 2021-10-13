package com.Generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Ángel Bryan");
        System.out.println(mensaje);
        int resultado = Suma(5, 3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");
         */

        /*
        System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 9;

        System.out.println(Math.sqrt(num2));
         */
        String mensaje1 = "Adios!!!";
        String mensaje2 = "Adios!!!";

        //  lenght nos muestra el numero de caracteres de un string
        System.out.println(mensaje2.length());

        // equals compara dos strings para ver si son iguales
        // equalsIgnoreCase compara ambas strings ignorando mayusculas
        // toUpperCase covierte un string en mayusculas
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));

    }
    public static String saludar(String nombre) {
        return "Hola como estas " + nombre;
    }
    public static int Suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void alerta(String mensaje) {
        System.out.println(mensaje);
    }
}
