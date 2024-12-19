package org.example;

import java.util.Random;
import java.util.Scanner;

public class CaraCruz {

    public static void caraCruz() {
        showOptions();
        String userOption = Reusable.saveOption();
        String randomOption = randomOption();
        checkResult(userOption, randomOption);
    }

    public static void showOptions() {
        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción");
        System.out.println("Cara (c) - Cruz (x)");

    }


    public static String randomOption() {
        Random random = new Random();
        String[] options = {"c", "x"};
        String randomOption = options[random.nextInt(2)];

        return randomOption;
    }

    public static void checkResult(String userOption, String randomOption) {
        System.out.println(randomOption);
        if (userOption.equals(randomOption)) {
            System.out.println("HAS GANADO!");
        } else {
            System.out.println("HAS PERDIDO");
        }
    }
}
