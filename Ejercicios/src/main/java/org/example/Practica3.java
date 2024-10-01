package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void ejercicio() {

        boolean loop = true;
        int age = 0;

        System.out.println("Introduce tu nombre:");
        Scanner entrada = new Scanner(System.in);
        String name = entrada.next();

        while (loop) {
            try {
                System.out.println("Hola " + name + ". Introduce tu edad:");
                age = entrada.nextInt();

                while (age < 0) {
                    System.out.println("Introduce de nuevo tu edad");
                    age = entrada.nextInt();

                }
                loop = false;

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }
        }


        if (age >= 18) {
            System.out.println("Enhorabuena " + name +". Puedes votar.");
        } else {
            System.out.println("Lo siento " + name + ". No puedes votar");
            System.out.println("Te faltan " + (18-age) + " año(s) para votar");
        }

    }

}
