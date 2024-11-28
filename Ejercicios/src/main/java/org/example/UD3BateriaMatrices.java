package org.example;

import java.util.Random;
import java.util.Scanner;

public class UD3BateriaMatrices {
    public static Scanner entry = new Scanner(System.in);
    public static Random random = new Random();

    public void ud3ejercicio1() {

        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce un numero: (" + i + ", " + j + ")");
                matriz[i][j] = entry.nextInt();
            }
        }

        System.out.println("Numero a buscar:");
        int search = entry.nextInt();


    }

    public void ud3ejercicio2() {
        int rows = random.nextInt(5)+1;
        int columns = random.nextInt(5)+1;

        int[][] matriz = new int[rows][columns];

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {
            int sum = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sum += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + sum);
        }

        System.out.println("Suma de columnas:");
        for (int i = 0; i < matriz[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matriz.length; j++) {
                sum += matriz[j][i];
            }
            System.out.println("Columna " + (i+1) + ": " + sum);
        }

    }

    public void ud3ejercicio3() {
        System.out.println("Numero de estudiantes: ");
        int no_studients = entry.nextInt();

        System.out.println("Numero de asignaturas: ");
        int no_subjects = entry.nextInt();

        String[][] matriz = new String[no_studients+1][no_subjects+1];
        matriz[0][0] = "Estudiantes";

        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Introduce el nombre del estudiante " + i  + ":");
            matriz[i][0] = entry.next();
        }

        for (int i = 1; i < matriz[0].length; i++) {
            System.out.println("Introduce la asignatura 1:");
            matriz[0][i] = entry.next();
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.println("Inserta la nota de " + matriz[i][0] + " para la asignatura " + matriz[0][j]);
                matriz[i][j] = entry.next();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }


        for (int i = 1; i < matriz.length; i++) {
            int sum = 0;
            for (int j = 1; j < matriz[0].length; j++) {
                sum += Integer.parseInt(matriz[i][j]);
            }
            int media = sum/no_subjects;
            System.out.println("La nota media del alumno " + matriz[i][0] + "es " + media);
        }

        for (int i = 1; i < matriz[0].length; i++) {
            int sum = 0;
            for (int j = 1; j < matriz.length; j++) {
                sum += Integer.parseInt(matriz[j][i]);
            }
            int media = sum/no_subjects;
            System.out.println("La nota media de la asignatura " + matriz[0][i] + "es " + media);
        }

    }
}
