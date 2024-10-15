package org.example;

import java.util.Scanner;

public class UD2Ejercicio2 {
    public void ud2ejercicio() {

        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce la primera cadena de caracteres:");
        String text = entry.nextLine();
        System.out.println("Introduce la segunda cadena de caracteres:");
        String text2 = entry.nextLine();

        if (text.length() > text2.length()) {
            System.out.println("La primera cadena es mas larga");
        }
        else if (text.length() < text2.length()){
            System.out.println("La segunda cadena es mas larga");
        }
        else {
            System.out.println("Las dos cadenas tienen la misma longitud");
        }

    }
}
