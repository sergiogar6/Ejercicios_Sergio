package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio() {

        int minim = 0;
        System.out.println("¿Introduce el primer numero?");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("¿Introduce el primer numero?");
        int num2 = entrada.nextInt();

        System.out.println("¿Introduce el primer numero?");
        int num3 = entrada.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("ERROR. Hay numeros introducidos que son iguales");
            System.exit(0);
        }

        if (num1 < num2) {
            minim = num1;
        } else {
            minim = num2;
        }

        if (num3 < minim) {
            minim = num3;
        }

        System.out.println("El numero minimo es " + minim);

    }
}
