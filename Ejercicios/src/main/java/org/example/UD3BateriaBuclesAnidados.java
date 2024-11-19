package org.example;

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
}
