package org.example;

import java.util.Arrays;
import java.util.Random;

public class UD3EliminarDuplicados {
    public void ud3ejercicio1() {
        int length = 0;
        int[] array = {4, 8, 3, 2, 1, 5, 1, 5, 6, 9, 9};
        int[] arrayAux = new int[array.length];
        Arrays.sort(array);

        // Si pos y pos+1 son iguales no declara el valor en el array auxiliar.
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1 && array[i] == array[i+1]) {
                continue;
            }
            arrayAux[i] = array[i];
            length++;
        }
        System.out.println(Arrays.toString(arrayAux));

        int[] arrayNew = new int[length];
        int position=0;

        for (int i = 0; i < array.length; i++) {
            if (arrayAux[i]!=0) {
                arrayNew[position] = arrayAux[i];
                position++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));

    }

    public void ud3ejercicio2() {
        int[] array = {4, 8, 3, 2, 1, 5, 1, 5, 6, 9, 9, 22, 23, 23, 11, 3, 4};
        int length = 0;
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i!=array.length-1 && array[i] == array[i+1]) {
                array[i] = 0;
            } else {
                length++;
            }
        }
        int position = 0;
        int[] arrayNew = new int[length];
        for (int i = 0; i < array.length;i++) {
            if (arrayNew[i] != 0) {
                arrayNew[position] = array[i];
                position++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }

    public void ud3ejercicio3() {
        int[] lottery = new int[6];
        Random random = new Random();
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = random.nextInt(49)+1;
        }
        System.out.println(Arrays.toString(lottery));
        Arrays.sort(lottery);

        boolean state = true;
        while (state) {
            state = false;
            for (int i = 0; i < lottery.length; i++) {
                if (i!= lottery.length-1 && lottery[i]==lottery[i+1]) {
                    System.out.println("Duplicado: " + lottery[i]);
                    lottery[i] = random.nextInt(49)+1;
                    state = true;
                }
            }
        }
        System.out.println(Arrays.toString(lottery));
    }
}
