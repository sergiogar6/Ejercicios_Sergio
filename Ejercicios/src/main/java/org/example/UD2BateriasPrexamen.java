package org.example;

import java.util.Scanner;

public class UD2BateriasPrexamen {
    public static Scanner entry = new Scanner(System.in);

    public void ejercicio1prexamen() {
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        int error = 0;
        System.out.println("Candidad de numeros a introducir");
        int quantity = entry.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Indroduce el numero " + i);
            int num = entry.nextInt();
            int resultado = num > 0 ? mayor++ :
                            num < 0 ? menor++ :
                            num == 0 ? igual++ : error++;
            if (error == 1) {
                System.out.println("Formato incorrecto");
                System.exit(0);
            }
        }
        System.out.println("Hay "+ mayor + " numeros mayores que 0");
        System.out.println("Hay "+ menor + " numeros menores que 0");
        System.out.println("Hay "+ igual + " numeros iguales que 0");
    }

    public void ejercicio2prexamen() {
        System.out.println("Introduce el numero base");
        int base = entry.nextInt();
        System.out.println("Introduce el numero exponente");
        int exponente = entry.nextInt();
        int resultado = base;

        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    }

    public void ejercicio3prexamen() {
        int first_payment = 10;
        System.out.println("Introduza cantidad de meses a financiar");
        int months = entry.nextInt();

        for (int i = 1; i <= months; i++) {
            System.out.println("Mes " + i + ": " + first_payment + "€" );
            first_payment *= 2;

        }
        System.out.println("Total a pagar: " + first_payment);
    }
}
