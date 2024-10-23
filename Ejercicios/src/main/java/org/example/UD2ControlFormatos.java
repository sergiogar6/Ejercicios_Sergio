package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class UD2ControlFormatos {
    public void ud2ejercicio() {
        Scanner entry = new Scanner(System.in);

        LocalDateTime current_date = LocalDateTime.now();
        int current_year = current_date.getYear();
        int birth_date = 0;

        System.out.println("Elige el modo de ejecucion (1 o 2):");
        String mode = entry.nextLine();

        switch (mode) {
            case "1":
                System.out.println("Escribe tu año de nacimiento");
                String birth = entry.nextLine();

                try {
                    birth_date = Integer.parseInt(birth);
                } catch (NumberFormatException e) {
                    System.out.println("El formato introducido es erroneo. Tienen que ser numeros");
                }

                break;

            case "2":
                System.out.println("Escribe tu edad");
                int age = entry.nextInt();

                if (entry.hasNextInt()) {

                } else {
                    System.out.println("La edad introducida tiene un formato incorrecto");
                }
                if (age >= 0) {
                    birth_date = current_year - age;
                } else {
                    System.out.println("Edad introducida no valida");
                }
        }


        if (birth_date >= 1900 && birth_date <= current_year) {
            if (birth_date <= 1927) {
                System.out.println("Eres de la generacion: Sin generacion bautizada");
            } else if (birth_date <= 1944) {
                System.out.println("Eres de la generacion: Generacon Silent");
            } else if (birth_date <= 1964) {
                System.out.println("Eres de la generacion: Baby Boomers");
            } else if (birth_date <= 1981) {
                System.out.println("Eres de la generacion: Generacion X");
            } else if (birth_date <= 1994) {
                System.out.println("Eres de la generacion: Generacion Y o Millenials");
            } else {
                System.out.println("Eres de la generacion: Generacion Z o Centennials");
            }
        }


    }


}

