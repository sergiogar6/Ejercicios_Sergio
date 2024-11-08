package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3BateriaArrays {
    public static Random random = new Random();
    public static Scanner entry = new Scanner(System.in);

    public void ejercicio1() {
        int[] num = new int[8];
        int result = 0;
        for (int i : num) {
            num[i] = random.nextInt(501);
            result += num[i];
        }
        System.out.println("La suma de los elementos es: " + result);
    }
    //TIENE QUE CAMBIAR EL ARRAY -----
    public void ejercicio2() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.print("Array invertida: ");
        for (int i : array) {
            System.out.print(array[array.length-i] + " ");
        }
    }

    public void ejercicio3() {
        int[] num = new int[25];
        int appear = 0;

        // !! for each solo es para acceder a valores, no modificarlos
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(101);
        }
        System.out.println("Introduce un numero:");
        int number = entry.nextInt();

        for (int i : num) {
            if (i == number) {
                appear++;
            }
        }
        System.out.println("Tu numero aparece " + appear + " veces en el array.");
    }

    public void ejercicio4() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array original: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Ingresa el índice a eliminar:");
        int index = entry.nextInt();

        System.out.println("Array resultante: ");
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            System.out.print(array[i] + " " );
        }
    }
    //TIENE QUE CAMBIAR EL ARRAY -----
    public void ejercicio5() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array original: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Array rotado: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void ejercicio6() {
        int[] array = {1, 2, 3, 2, 2, 1};
        boolean simetrico = false;

        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] == array[array.length-1-i]) {
                simetrico = true;
            } else {
                simetrico = false;
                break;
            }
        }
        if (simetrico) {
            System.out.println("Es simetrico: SI");
        } else {
            System.out.println("Es simetrico: NO");
        }
    }


    public void ejercicio7() {
        int[] array = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] arraysCombined = new int[array.length + array2.length];

        System.arraycopy(array, 0, arraysCombined, 0, array2.length);
        System.arraycopy(array2, 0, arraysCombined, array.length, array2.length);

        System.out.println("Array combinado: " + Arrays.toString(arraysCombined));


    }

    public void ejercicio8() {
        int[] array = {1, 2, 3, 5};
        int[] array2 = new int[array.length+1];

        System.out.println(Arrays.toString(array));
        System.out.println("Numero que quieres insertar:");
        int num = entry.nextInt();
        System.out.println("Posicion en la que quieres insertarlo");
        int position = entry.nextInt();

        array2[position] = num;

        System.arraycopy(array, position, array2, position+1, array.length-position);

        if (position != 0) {
            System.arraycopy(array, 0, array2, 0, array.length-position);
        }

        System.out.println(Arrays.toString(array2));
    }

    public void ejercicio9() {
        String[] array = {"hola", "buenas", "me", "llamo", "sergio", "encantado"};
        String mayor = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > mayor.length()) {
                mayor = array[i];
            }
        }

        System.out.println("La palabra mas larga es: " + mayor);
    }

    public void ejercicio10() {
        String[] array = {"hola", "buenas", "eme", "llamo", "esergio", "encantado"};
        System.out.println("Escribe una letra:");
        String letter = entry.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == letter.charAt(0)) {
                System.out.println(array[i]);
            }
        }

    }
}
