package org.example;

import java.util.Scanner;

public class UD2Ejercicio3 {
    public void ud2ejercicio() {

        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce una cadena numerica");
        String text = entry.nextLine();
        System.out.println("Introduce el la cantidad de caracteres que quieras quitar");
        int remove = entry.nextInt();

        System.out.println(text.substring(0, text.length()-remove));


    }
}
