package org.example;

import java.util.Scanner;

public class UD2Practica1 {
    public void ud2ejercicio() {

        Scanner entry = new Scanner(System.in);

        int day= 0;
        int month= 0;
        int year = 0;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String date = entry.nextLine();

        if (date.length() == 10 && date.substring(2, 3).equals("/") && date.substring(5, 6).equals("/")) {
            
            String string_day = date.substring(0,2);
            String string_month = date.substring(3,5);
            String string_year = date.substring(6,10);

            try {
                day = Integer.parseInt(string_day);
                month = Integer.parseInt(string_month);
                year = Integer.parseInt(string_year);
            } catch (NumberFormatException e) {
                System.out.println("El formato de la fecha debe ser numerico");
                System.exit(0);
            }


            if (day <= 31 && day > 1 && month <= 12 && month > 1 && year > 0) {
                int result = (day + month + year);

                String string_result = Integer.toString(result);
                int num1 = Integer.parseInt(string_result.substring(0,1));
                int num2 = Integer.parseInt(string_result.substring(1,2));
                int num3 = Integer.parseInt(string_result.substring(2,3));
                int num4 = Integer.parseInt(string_result.substring(3,4));

                int lucky_number = (num1 + num2 + num3 + num4);


                System.out.println(date);
                System.out.println(day + "+" + month + "+" + year + " = " + result);
                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + lucky_number);
                System.out.println("Tu número de la suerte es " + lucky_number);
            } else {
                System.out.println("El formato de numeros introducido es incorrecto");
            }
        } else {
            System.out.println("El formato introducido es incorrecto");
        }

    }
}
