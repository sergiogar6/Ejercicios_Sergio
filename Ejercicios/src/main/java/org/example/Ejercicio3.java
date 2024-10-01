package org.example;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio() {

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
}
