package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UD2Altura {
    public void ud2ejercicio() {

        Scanner entry = new Scanner(System.in);
        int altura = 0;

        try {
            System.out.println("Escribe tu altura en centímetros");
            altura = entry.nextInt();
        }catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Formato erroneo.");
        }
        if (altura > 0) {
            if (altura <= 150) {
                System.out.println("Persona de altura baja");
            } else if (altura <= 175) {
                System.out.println("Persona de altura media");
            } else {
                System.out.println("Persona de altura alta");
            }
        } else {
            System.out.println("ERROR. Introduce una altura valida");
        }

    }
}
