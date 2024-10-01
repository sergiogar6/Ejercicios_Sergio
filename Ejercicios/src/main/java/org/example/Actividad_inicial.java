package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_inicial {
    public void ejecutar() {

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso);

        int numero = 0;
        int numero2 = 0;
        while (numero == 0 || numero2==0){
            try {

                System.out.println("Introduce un numero");
                numero = entrada.nextInt();
                System.out.println("Introduce otro numero");
                numero2 = entrada.nextInt();

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }

            if (numero==0 || numero2==0) {
                System.out.println("ERROR. Un sumando no puede ser 0.");
            } else {
                int resultado = numero + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
        }
    }
}
