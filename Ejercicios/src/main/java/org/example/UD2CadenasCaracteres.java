package org.example;

import java.util.Scanner;

public class UD2CadenasCaracteres {
    public void ud2ejercicio1() {

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

    public void ud2ejercicio2() {

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

    public void ud2ejercicio3() {

        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce una cadena numerica");
        String text = entry.nextLine();
        System.out.println("Introduce el la cantidad de caracteres que quieras quitar");
        int remove = entry.nextInt();

        System.out.println(text.substring(0, text.length()-remove));
    }

    public void ud2ejercicio4() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce un texto");
        String text = entry.nextLine();
        System.out.println("Introduce");
        String substring = "Mundo";


        String new_text = text.replace(substring,"");
        int veces = (text.length()-new_text.length());
        int times_appear = veces / substring.length();

        System.out.println("La cadena " + substring + " aparece " + times_appear + " veces.");
    }

    public void ud2ejercicio5() {
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
