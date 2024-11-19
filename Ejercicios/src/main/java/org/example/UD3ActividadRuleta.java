package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3ActividadRuleta {
    public void ud3ejercicio() {
        Scanner entry = new Scanner(System.in);
        Random random = new Random();
        Integer[] valid_numbers = new Integer[37];
        for (int i = 0; i < valid_numbers.length; i++) {
            valid_numbers[i] = i;
        }
        String[] colors = {"rojo", "negro"};
        String[] values = {"par", "impar"};
        String color = "";
        String value = "";
        System.out.println("Escribe un numero del 0 al 36.");
        int number = entry.nextInt();

        boolean find_number = Arrays.asList(valid_numbers).contains(number);
        if (!find_number) {
            System.out.println("ERROR. El número introducido no es válido");
            return;
        } else {
            if (number != 0) {
                System.out.println("Inserta un color (rojo/negro)");
                color = entry.nextLine();
                boolean find_color = Arrays.asList(colors).contains(color);

                if (!find_color) {
                    System.out.println("ERROR. El color introducido no es válido");
                    return;
                } else {
                    System.out.println("Inserta un valor (par/impar)");
                    value = entry.nextLine();
                    boolean find_value = Arrays.asList(values).contains(value);

                    if (!find_value) {
                        System.out.println("ERROR. El valor introducido no es válido");
                        return;
                    }
                }
            }
        }


        int random_number = random.nextInt(valid_numbers.length + 1);
        String random_color = colors[random.nextInt(colors.length)];
        String random_value = "";
        if (random_number % 2 == 0) {
            random_value = "par";
        } else {
            random_value = "impar";
        }

        System.out.println("Ha tocado: " + random_number + " " + random_color + " " + random_value);

        if (random_number == number && random_color.equals(color) && random_value.equals(value)) {
            System.out.println("HAS GANADO!!!");
        } else if (number != 0 && random_color.equals(color)) {
            System.out.println("Has acertado el color.");
        } else if (number != 0 && random_value.equals(value)) {
            System.out.println("Has acertado la opción " + value);
        } else if (number != 0 && number == random_number) {
            System.out.println("Has acertado el número");
        } else if (number == 0 && random_number == 0) {
            System.out.println("HAS GANADO y los demás usuarios pierden.");
        } else {
            System.out.println("Has perdido.");


        }
    }
}
