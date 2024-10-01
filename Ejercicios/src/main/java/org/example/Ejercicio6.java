package org.example;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio() {

        System.out.println("¿Hay tomate? si/no");
        Scanner entrada = new Scanner(System.in);
        String tomate = entrada.next();

        System.out.println("¿Hay aceite? si/no");
        String aceite = entrada.next();

        System.out.println("¿Hay jamon? si/no");
        String jamon = entrada.next();

        if (tomate.equals("no") || aceite.equals("no") || jamon.equals("no")) {
            System.out.println("¡Tenemos que ir a comprar!");
        } else {
            System.out.println("¡No tenemos que ir a comprar!");
        }


    }
}
