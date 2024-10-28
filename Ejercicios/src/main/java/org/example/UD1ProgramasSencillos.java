package org.example;

import java.util.Scanner;

public class UD1ProgramasSencillos {
    public void ejercicio1() {

        System.out.println("Introduce un numero...");
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo.");
        } else {
            System.out.println("El numero es " + numero);
        }

    }

    public void ejercicio2() {

        System.out.println("Introduce un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println("Introduce otro numero");
        int numero2 = entrada.nextInt();

        if (numero > numero2) {
            System.out.println(numero + " es mayor que " + numero2);
        } else if (numero < numero2) {
            System.out.println(numero + " es menor que " + numero2);
        } else {
            System.out.println("ERROR: Los numeros introducidos son iguales");
        }

    }

    public void ejercicio3() {

        System.out.println("Introduce un dividendo");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println("Introduce divisor");
        int numero2 = entrada.nextInt();

        if (numero2 == 0) {
            System.out.println("ERROR: No se puede dividir entre 0");
        }
        else {
            int resultado = numero/numero2;
            System.out.println(numero + " / " + numero2 + " = " + resultado);

        }
    }

    public void ejercicio4() {

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

    public void ejercicio5() {

        int minim = 0;
        System.out.println("¿Introduce el primer numero?");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("¿Introduce el primer numero?");
        int num2 = entrada.nextInt();

        System.out.println("¿Introduce el primer numero?");
        int num3 = entrada.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("ERROR. Hay numeros introducidos que son iguales");
            System.exit(0);
        }

        if (num1 < num2) {
            minim = num1;
        } else {
            minim = num2;
        }

        if (num3 < minim) {
            minim = num3;
        }

        System.out.println("El numero minimo es " + minim);
    }

    public void ejercicio6() {

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
