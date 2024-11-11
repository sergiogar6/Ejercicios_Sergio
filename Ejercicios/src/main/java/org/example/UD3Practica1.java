package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica1 {
    public void ud3practica() {
        Scanner entry = new Scanner(System.in);
        Random random = new Random();
        int[] arrayPotencias1 = new int[7];
        int[] arrayPotencias2 = new int[7];
        int potenciaTotal1 = 0;
        int potenciaTotal2 = 0;
        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;
        boolean error = false;

        System.out.println("Equipo 1");
        do {
            error = false;
            System.out.println("Introduce la potencia de los samurais:");
            String potencia1 = entry.nextLine();
            String[] arrayPotencia1 = potencia1.split(" ");
            potenciaTotal1 = 0;

            if (arrayPotencia1.length == 7) {
                for (int i = 0; i < arrayPotencia1.length; i++) {
                    try {
                        arrayPotencias1[i] = Integer.parseInt(arrayPotencia1[i]);
                        potenciaTotal1+=arrayPotencias1[i];
                    } catch (NumberFormatException | InputMismatchException e) {
                        System.out.println("Formato inválido");
                        error = true;
                        break;
                    }

                }
                if (error) {
                    continue;
                }
                if (potenciaTotal1 != 30) {
                    System.out.println("ERROR. La potencia total no suma 30.");
                }
            } else {
                System.out.println("Longitud de formato incorrecta");
            }


        } while (potenciaTotal1 != 30);
        System.out.println("Equipo completado.");

        System.out.println("Equipo 2");
        do {
            error = false;
            System.out.println("Introduce la potencia de los samurais:");
            String potencia2 = entry.nextLine();
            String[] arrayPotencia2 = potencia2.split(" ");
            potenciaTotal2 = 0;
            if (arrayPotencia2.length == 7) {
                for (int i = 0; i < arrayPotencia2.length; i++) {
                    try {
                        arrayPotencias2[i] = Integer.parseInt(arrayPotencia2[i]);
                        potenciaTotal2 += arrayPotencias2[i];
                    } catch (NumberFormatException | InputMismatchException e) {
                        System.out.println("Formato inválido");
                        error = true;
                        break;
                    }
                }
                if (error) {
                    continue;
                }
                if (potenciaTotal2 != 30) {
                    System.out.println("ERROR. La potencia total no suma 30.");
                }
            } else {
                System.out.println("Longitud de formato incorrecta");
            }
        } while (potenciaTotal2 != 30);
        System.out.println("Equipo completado.");

        System.out.println("¡Empieza la batalla!");
        int inicio = random.nextInt(7);
        System.out.println("La batalla inicia con el samurai " + (inicio+1));
        for (int i = inicio; bajasEquipo1 < 4 && bajasEquipo2 < 4; i = (i + 1) % 7) {
            if (arrayPotencias1[i] > arrayPotencias2[i]) {
                System.out.println("Samurai " + (i+1) + ". Gana el Equipo 1. " + arrayPotencias1[i] + " vs " + arrayPotencias2[i]);
                bajasEquipo2++;
                arrayPotencias2[i] = 0;
            } else if (arrayPotencias1[i] < arrayPotencias2[i]) {
                System.out.println("Samurai " + (i+1) + ". Gana el Equipo 2. " + arrayPotencias1[i] + " vs " + arrayPotencias2[i]);
                bajasEquipo1++;
                arrayPotencias1[i] = 0;
            } else if (arrayPotencias1[i] == arrayPotencias2[i]){
                System.out.println("Samurai " + (i+1) + ". Empate. " + arrayPotencias1[i] + " vs " + arrayPotencias2[i]);
                bajasEquipo1++;
                bajasEquipo2++;
                arrayPotencias1[i] = 0;
                arrayPotencias2[i] = 0;
            }
        }
        if (bajasEquipo1 == 4 & bajasEquipo2 == 4) {
            System.out.println("EMPATE. Ambos equipos han tenido 4 bajas");
        } else if (bajasEquipo1 == 4) {
            System.out.println("Equipo 2 GANA. Equipo 1 ha tenido 4 bajas.");
        } else if (bajasEquipo2 == 4) {
            System.out.println("Equipo 1 GANA. Equipo 2 ha tenido 4 bajas.");
        }
    }
}
