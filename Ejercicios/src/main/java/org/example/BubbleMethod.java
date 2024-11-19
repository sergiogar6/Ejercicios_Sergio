package org.example;

import java.util.Arrays;

public class BubbleMethod {
    public void bubble() {

        int[] vector={6,5,3,1,8,7,2,4};
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                //El valor máximo lo más a la derecha posible
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vector));
    }
}
