package org.example;

import java.util.Scanner;

public class UD2Ejercicio5 {
    public void ud2ejercicio() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Jugador 1 escribe una cadena:");
        String cadena = entry.nextLine();

        System.out.println("Jugador 2 escribe una palabra:");
        String palabra = entry.nextLine();

        for (int i=5; i>=0; i--) {
            if (cadena.contains(palabra)) {
                System.out.println("¡Enhorabuena has acertado una palabra!");
                i = 0;
            } else {
                System.out.println("Intento fallido");
                System.out.println("Te quedan " + i + " intentos");
                
            }
        }
    }
}
