package org.example;

import java.util.Scanner;

public class UD4Metodos1 {
    public static void CalcularCubo() {
        int number = askNumber();
        int cube = calculateCube(number);
        showResult(number, cube);
    }

    public static int askNumber() {
        System.out.println("Escribe un numero:");
        return Reusable.saveNumber();
    }

    public static int calculateCube(int number) {
        int cube = number * number * number;
        return cube;
    }

    public static void  showResult(int number, int cube) {
        System.out.println("El cubo de " + number + " es: " + cube);
    }

}
