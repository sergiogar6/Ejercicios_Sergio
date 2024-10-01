package org.example;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio() {

        System.out.println("Introduce un numero...");
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo.");
        } else {
            System.out.println("El numero es " + numero);
        }

    }
}
