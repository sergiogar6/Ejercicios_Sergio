package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UD2Practica2 {
    public void ud2ejercicio() {
        Scanner entry = new Scanner(System.in);
        boolean error = false;
        float result = 0;
        float num1 = 0;
        float num2 = 0;
        String mode = "";

        System.out.println("BIENVENIDO A LA CALCULADORA");
        try {
            System.out.println("Introduce el primer operando:");
            num1 = entry.nextFloat();
            System.out.println("Introduce el signo a aplicar (+,-,/,x,R):");
            mode = entry.next();
            if (!mode.equals("R")) {
                System.out.println("Introduce el segundo operando:");
                num2 = entry.nextFloat();
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Introduce un valor valido");
            error = true;
        }
        switch (mode) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("No se puede dividir entre 0");
                    error = true;
                }
                break;
            case "x":
                result = num1 * num2;
                break;
            case "R":
                if (num1 >=0) {
                    result = (float) Math.sqrt(num1);
                } else {
                    System.out.println("No se puede hacer la raiz cuadrada de un numero negativo");
                    error = true;
                }
                break;
            default:
                if (!error) {
                    System.out.println("Operación no válida");
                    error = true;
                }
        }
        if (!error) {
            System.out.println("El resultado es " + result);
        }
    }
}
