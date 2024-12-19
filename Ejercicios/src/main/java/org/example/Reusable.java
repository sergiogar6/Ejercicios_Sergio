package org.example;

import java.util.Scanner;

public class Reusable {

    //FUNCION PARA GUARDAR STRINGS
    public static String saveOption() {
        Scanner entry = new Scanner(System.in);
        String userOption = entry.nextLine();

        return userOption;
    }

    //FUNCION PARA GUARDAR NUMEROS
    public static int saveNumber() {
        Scanner entry = new Scanner(System.in);
        int number = entry.nextInt();

        return number;
    }
}
