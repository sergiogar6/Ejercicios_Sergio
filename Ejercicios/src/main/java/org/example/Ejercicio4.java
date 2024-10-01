package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio() {

        int base = 0;
        int altura = 0;

        while (base==0) {
            System.out.println("Introduce el valor de la base:");
            Scanner entrada = new Scanner(System.in);
            base = entrada.nextInt();
            if (base==0) {
                System.out.println("El valor de la base debe ser positivo");
            }
        }

        while (altura==0){
            System.out.println("Introduce el valor de la altura:");
            Scanner entrada = new Scanner(System.in);
            altura = entrada.nextInt();
            if (base<=0) {
                System.out.println("El valor de la base debe ser positivo");
            }
        }
        
        int area = (base*altura)/2;
        System.out.println("El área del triángulo es: " + area);

    }
}
