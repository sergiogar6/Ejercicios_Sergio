package org.example;

import java.util.Scanner;

public class UD2Ejercicio4 {
    public void ud2ejercicio() {

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
}
