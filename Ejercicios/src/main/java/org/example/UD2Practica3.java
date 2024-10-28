package org.example;

import java.util.Scanner;

public class UD2Practica3 {
    public void ud2ejercicio() {
        Scanner entry = new Scanner(System.in);
        int result=0;
        int multpl=10;
        int digit=0;
        int missing_multpl=0;
        int missing_digit=0;
        System.out.println("Introduzca ISBN");
        String isbn = entry.nextLine();

        if (isbn.length() == 10) {
            for (int i = 0; i < isbn.length(); i++) {
                if (isbn.substring(i, i+1).equals("X")) {
                    digit = 10;
                } else if (isbn.substring(i, i+1).equals("?")) {
                    missing_multpl = multpl;
                    digit = 0;
                }
                else {
                    try {
                        digit = Integer.parseInt(isbn.substring(i, i + 1));
                    } catch (NumberFormatException e) {
                        System.out.println("Introduce el formato correcto");
                        System.exit(0);
                    }
                }
                result += digit * multpl;
                multpl--;
            }
            if (result%11 == 0) {
                System.out.println("El ISBN es valido.");
            } else if (missing_multpl>0) {
                for (int i = 0; i <= 9; i++) {
                    if ((i*missing_multpl+result)%11 == 0) {
                        missing_digit = i;
                        break;
                    }
                }
                System.out.println("El digito que falta es " + missing_digit);
            } else {
                System.out.println("El ISBN no es valido.");
            }
        } else {
            System.out.println("La longitud del ISBN no es correcta");
        }

    }
}
