package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public void ejercicio() {

        boolean loop = true;
        int num1 = 0;
        int num2 = 0;
        Scanner entry = new Scanner(System.in);

        while (loop) {
            try {
                System.out.println("Introduce el multiplicando (3 cifras):");
                num1 = entry.nextInt();

                if (num1 >= 100 && num1 <= 999) {
                    loop=false;
                } else { System.out.println("ERROR. El multiplicando debe tener 3 cifras"); }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entry.nextLine();
            }
        }

        loop = true;
        while (loop) {
            try {
                System.out.println("Introduce el multiplicador (3 cifras):");
                num2 = entry.nextInt();

                if (num2 >= 100 && num2 <= 999) {
                    loop = false;
                } else { System.out.println("ERROR. El multiplicador debe tener 3 cifras"); }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entry.nextLine();
            }
        }

        int resultado = (num1*num2);

        String numB = Integer.toString(num2);
        String numB_1 = numB.substring(2,3);
        int num_1 = Integer.parseInt(numB_1);
        int num_1_Result = num1 * num_1;

        String numB_2 = numB.substring(1,2);
        int num_2 = Integer.parseInt(numB_2);
        int num_2_Result = num1 * num_2;

        String numB_3 = numB.substring(0,1);
        int num_3 = Integer.parseInt(numB_3);
        int num_3_Result = num1 * num_3;

        System.out.println("El producto de la multiplicacion es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("   " + num1);
        System.out.println("x  " + num2);
        System.out.println("_______");
        System.out.println("  " + num_1_Result);
        System.out.println(" " + num_2_Result + "x");
        System.out.println(num_3_Result + "xx");
        System.out.println("_______");
        System.out.println(resultado);

    }

}