package org.example;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio() {

        System.out.println("Introduce un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println("Introduce otro numero");
        int numero2 = entrada.nextInt();

        if (numero > numero2) {
            System.out.println(numero + " es mayor que " + numero2);
        } else if (numero < numero2) {
            System.out.println(numero + " es menor que " + numero2);
        } else {
            System.out.println("ERROR: Los numeros introducidos son iguales");
        }

    }
}
