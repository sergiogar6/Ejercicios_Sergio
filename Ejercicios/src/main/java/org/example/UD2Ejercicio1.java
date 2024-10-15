package org.example;

import java.util.Scanner;

public class UD2Ejercicio1 {
    public void ud2ejercicio() {

        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres:");
        String text = entry.nextLine();

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.replace(" ",""));
        String mitad1 = text.substring(0,text.length()/2);
        String mitad2 = text.substring(text.length()/2);
        System.out.println("La primera mitad del texto es " + mitad1 + " y la segunda mitad del texto es " + mitad2 );
        System.out.println(text.toUpperCase());

    }
}
