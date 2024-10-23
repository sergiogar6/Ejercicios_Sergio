package org.example;

import java.util.Scanner;

public class UD2EjerciciosBucles {
    public static Scanner entry = new Scanner(System.in);
    public void ejercicio1bucles() {

        String pass2;

        System.out.println("Crea tu contraseña");
        String pass1 = entry.nextLine();

        do {

            System.out.println("Escribe tu contraseña creada");
            pass2 = entry.nextLine();

        } while (!pass1.equals(pass2));

        System.out.println("Verificacion satisfactoria");

    }

    public void ejercicio2bucles() {

        System.out.println("Introduce un numero");
        int num = entry.nextInt();

        for (int i=num; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void ejercicio3bucles() {
        int num = 50;
        int multiplo = 3;
        System.out.println("Mutiplos de " + num);
        for (int i = 0; i <= 50; i++) {
            if (i%multiplo == 0) {
                System.out.println(i);
            }
        }
    }

    public void ejercicio4bucles() {

        System.out.println("Introduce una cadena");
        String cadena = entry.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public void ejercicio5bucles() {
        System.out.println("Introduce un numero");
        int num = entry.nextInt();
        System.out.println("Tabla de multiplicar del " + num);

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }

    public void ejercicio6bucles() {
        System.out.println("Cuantos numeros quieres sumar");
        int quantity = entry.nextInt();
        int result=0;
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Inserta el numero " + i);
            int num = entry.nextInt();
            result += num;
        }
        System.out.println("El resultado es " + result);
    }

    
}
