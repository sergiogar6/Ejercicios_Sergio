package org.example;


import java.util.Random;
import java.util.Scanner;

public class UD2Random {
    public static Scanner entry = new Scanner(System.in);
    public static Random random = new Random();

    public void ejercicio1random() {
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        System.out.println("Primer dado: " + dado1);
        System.out.println("Primer dado: " + dado2);
        System.out.println(dado1 + " + " + dado2 + " = " + (dado1+dado2));
    }

    public void ejercicio2random() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int caracteres_lenght = caracteres.length();
        int pass_lenght = 12;
        int indice;
        String pass = "";
        for (int i=0; i < pass_lenght; i++) {
            indice = random.nextInt(caracteres_lenght);
            pass += caracteres.charAt(indice);
        }

        System.out.println(pass);
    }

    public void ejercicio3random() {
        System.out.println("Establece el rango minimo:");
        int min = entry.nextInt();
        System.out.println("Establece el rango maximo");
        int max = entry.nextInt();
        if (min < max) {
            System.out.println("Indica la cantidad de numeros a generar:");
            int quantity = entry.nextInt();
            String number = "";
            for (int i = 0; i < quantity; i++) {
                number += random.nextInt(max - min + 1) + min;
            }
            System.out.println(number);
        } else {
            System.out.println("El minimo no puede ser mayor que el maximo");
        }

    }

    public void ejercicio4random() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int caracteres_lenght = caracteres.length();
        int pass_lenght = random.nextInt(3) + 6;
        int indice;
        String pass = "";
        for (int i=0; i < pass_lenght; i++) {
            indice = random.nextInt(caracteres_lenght);
            pass += caracteres.charAt(indice);
        }

        System.out.println(pass);
    }

}
