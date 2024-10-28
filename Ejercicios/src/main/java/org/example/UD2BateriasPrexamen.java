package org.example;

import java.util.InputMismatchException;
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

    public void ejercicio4prexamen() {
        System.out.println("Introduce tu nota (redondeada)");
        int nota = entry.nextInt();

        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
            case 5:
                System.out.println("Suficiente");
            case 6:
                System.out.println("Bien");
            case 7,8:
                System.out.println("Notable");
            case 9,10:
                System.out.println("Sobresaliente");
            default:
                System.out.println("No válido");
        }
    }

    public void ejercicio5prexamen() {
        int mileurista=0;
        int max_salary=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Escribe tu sueldo " + i);
            int salary = entry.nextInt();

            if (salary >= 1000) {
                mileurista++;
            }
            if (salary > max_salary) {
                max_salary = salary;
            }
        }
        System.out.println("El suedo mas alto es " + max_salary + " €.");
        System.out.println(mileurista + " personas cobran mas de 1000€.");
    }

    public void ejercicio6prexamen() {
        System.out.println("Cantidad de alumnos a introducir:");
        int alumn = entry.nextInt();

        int sum_age = 0;
        int sum_height = 0;
        int total_age = 0;
        int total_height = 0;

        for (int i = 1; i <= alumn; i++) {
            System.out.println(i + ". Introduce tu edad:");
            int age = entry.nextInt();
            System.out.println(i + ". Introduce tu altura (cm):");
            int height = entry.nextInt();

            sum_age += age;
            sum_height += height;

            if (age >= 18) {
                total_age++;
            }
            if (height >= 175) {
                total_height++;
            }
        }
        System.out.println("La edad media es de " + sum_age/alumn + " años.");
        System.out.println("La altura media es de " + sum_height/alumn + " cm.");
        System.out.println("Hay " + total_age + " personas que tienen 18 o más años.");
        System.out.println("Hay " + total_height + " personas que miden 175 cm o más.");
    }

    public void ejercicio7prexamen() {
        boolean error = true;
        int num = 0;
        int sequence = 0;
        int sum = 1;
        while (error) {
            try {
                System.out.println("Introduce un numero positivo:");
                num = entry.nextInt();
                error = false;
                if (num <= 0) {
                    error = true;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("El numero no es válido");
                error = true;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(sequence);
            sequence += sum;
            sum = sequence - sum;
        }

    }
}

