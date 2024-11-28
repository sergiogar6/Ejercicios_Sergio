package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class UD3BateriaBuclesAnidados {
    public static Scanner entry = new Scanner(System.in);
    public void ud3ejercicio1() {

    }
    public void ud3ejercicio2() {

    }
    public void ud3ejercicio3() {

    }
    public void ud3ejercicio4() {
        System.out.print("Introduzca el valor m:");
        int m = entry.nextInt();

        System.out.print("Numeros primos: ");
        for (int i = 2; i < m; i++) {
            boolean primo = true;   
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }
    }
    public void ud3ejercicio5() {
        int[][] matriz1 = {{1,5,9},{20,17,2}};
        int[][] matriz2 = {{6,7,5},{15,10,0}};
        int[][] matriz3 = new int[2][3];

        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j] > matriz2[i][j]) {
                        matriz3[i][j] = matriz1[i][j];
                    } else {
                        matriz3[i][j] = matriz2[i][j];
                    }
                }

            }
            for (int[] i : matriz3) {
                System.out.println(Arrays.toString(i));
            }
        } else {
            System.out.println("Las matrices deben tener el mismo tamaño.");
        }



    }
}
