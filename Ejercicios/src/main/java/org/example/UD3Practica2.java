package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica2 {
    public void ud3practicca() {
        Scanner entry = new Scanner(System.in);
        Random random = new Random();
        Integer[] lottery = new Integer[6];
        String[] numberString = new String[7];
        int randomReintegro = random.nextInt(10);
        int complementary = 0;

        Integer[] lottery2;
        do {
            for (int i = 0; i < lottery.length; i++) {
                lottery[i] = random.nextInt(49) + 1;
            }
            //El .distinct() no funcionaba con array de tipo "Integer"
            lottery2 = Arrays.stream(lottery).distinct().toArray(Integer[]::new);
        } while (lottery2.length < lottery.length);

        do {
            complementary = random.nextInt(49) + 1;
        } while (Arrays.asList(lottery).contains(complementary));

        boolean numbersFormat;
        boolean numbersValue;
        String numbers;
        do {
            System.out.println("Elige tus 6 numeros y el reintegro (X-X-X-X-X-X/Y): ");
            numbers = entry.nextLine();

            numbersFormat = numbers.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");
            numbersValue = true;

            if (!numbersFormat) {
                System.out.println("ERROR. Formato incorrecto.");
                continue;
            }

            numberString = numbers.split("[-/]");

            for (int i = 0; i < numberString.length; i++) {
                if (Integer.parseInt(numberString[i]) < 0 || Integer.parseInt(numberString[i]) > 49 && i != 6) {
                    System.out.println("ERROR. Numero introducido no válido");
                    numbersValue = false;
                    break;
                }
            }

        } while (!numbersFormat || !numbersValue);

        System.out.println(Arrays.toString(numberString));
        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(lottery));
        System.out.println("Complementario: " + complementary);
        System.out.println("Reintegro: " + randomReintegro);

        int guesses = 0;
        for (int i = 0; i < lottery.length; i++) {
            if (Arrays.asList(lottery).contains(Integer.parseInt(numberString[i]))) {
                guesses++;
            }
        }

        //Comprabacion de acierto del complementario.
        boolean guessComplementary = false;
        if (Arrays.asList(numberString).contains(complementary)) {
            guessComplementary = true;
        }

        int guessReintegro = 0;
        if (randomReintegro == Integer.parseInt(numberString[6])) {
            guessReintegro++;
        }
        System.out.println("Resultados: ");
        System.out.println((guessReintegro+guesses) + " acierto.");

        if (guesses == 3) {
            System.out.println("5ª Categoria");
        } else if (guesses == 4) {
            System.out.println("4ª Categoria");
        } else if (guesses == 5) {
            if (guessComplementary) {
                System.out.println("2ª Categoria");
            } else {
                System.out.println("3ª Categoria");
            }
        } else if (guesses == 6) {
            if (randomReintegro == Integer.parseInt(numberString[6])) {
                System.out.println("Categoria especial.");
            } else {
                System.out.println("1ª Categoria");
            }
        } else {
            System.out.println("No premiado.");
        }

    }

}
