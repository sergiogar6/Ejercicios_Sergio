package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class UD4Proyecto {
    /**
     * author Sergio
     * version 1.0.0
     */
    public static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {

        }
    }

    public static boolean casoDePrueba() {

        String UserOption = entry.nextLine();
        if (UserOption.equals("0")) {
            return false;
        } else {
            String[] cardsValue = UserOption.split(" ");
            System.out.println(findMissingCard(cardsValue));
            return true;
        }
    }


    /**
     * El metodo convertCard convierte la carta introducida por el usuario a su valor real en int.
     * @param value - variable tipo String que contiene el numero de la carta
     * @return devuelve la conversion de la letra de la carta a su valor real y en caso de no serlo convierte el numero a int.
     */
    public static int convertCard(String value) {
        switch (value) {
            case "A":
                return 14;
            case "K":
                return 13;
            case "Q":
                return 12;
            case "J":
                return 11;
            default:
                return Integer.parseInt(value);
        }
    }

    /**
     * El método convertCardToString convierte el numero encontrado para completar la escalera en su letra correspondiente y si no, lo convierte en String
     * @param number - variable tipo int que contiene el valor del número que falta para completar la escalera
     * @return - devuelve el número convertido en String
     */
    public static String convertCardToString(int number) {
        switch (number) {
            case 14:
                return "A";
            case 13:
                return "K";
            case 12:
                return "Q";
            case 11:
                return "J";
            default:
                return String.valueOf(number);
        }
    }

    /**
     * El método checkCardColor comprueba que todas las cartas introducidas sean del mismo palo (pica, diamante, trebor, corazon), para que la escalera de color sea válida.
     * @param cardsValue - vector de tipo String que contiene las cartas introducidas por el usuario.
     * @return - devuelve true si las cartas introducidas son del mismo palo y false si no lo son.
     */
    public static boolean checkCardColor(String[] cardsValue) {
        //Coge el palo de la primera letra y compara que tenga el mismo valor que los demas palos.
        String cardColor = cardsValue[1];
        for (int i = 1; i < cardsValue.length; i+=2) {
            if (!cardsValue[i].equals(cardColor)) {
                return false;
            }
        }
        return true;
    }

    /**
     * El metodo findMissingCard busca el número de la carta que hace falta para completar la escalera de color
     * @param cardsValue - vector de tipo String que contiene las cartas introducidas por el usuario.
     * @return - "NADA" si no se cumple alguna de las condiciones para que la escalera sea válida y missingCard que es el numero encontrado para la escalera + la letra de su palo.
     */
    public static String findMissingCard(String[] cardsValue) {
        String missingCard;
        if (checkCardColor(cardsValue)) {
            //Creo un vector que contenga solo los numeros
            Integer[] cardNumbers = new Integer[cardsValue.length/2];
            int count = 0;
            for (int i = 0; i < cardsValue.length; i+=2) {
                String value = cardsValue[i];
                cardNumbers[count] = convertCard(value);
                if (cardNumbers[count] > 14 || cardNumbers[count] < 1) {
                    return "NADA";
                }
                count++;
            }

            Arrays.sort(cardNumbers);
            int missingNumber = 0;
            int check = 0;
            // Recorre cada valor del vector y se resta a su siguiente buscando que la diferencia siempre sea 1 (es decir, son consecutivos)
            // Si la diferencia es 2 se guarda el la variable auxiliar check para que en caso de que vuelve a ver otra diferencia de 2, la escalera no sea posible.
            // Despues si no hay ninguna diferencia de 2 y el ultimo numero del vector es el 14 (as) el numero a completar sera el mas bajo.
            // Y si la diferencia siempre es de 1 y no se cumple nada mas, el numero pasara a ser el consecutivo del ultimo numero del vector.
            for (int i = 0; i < cardNumbers.length-1; i++) {
                int difference = cardNumbers[i+1] - cardNumbers[i];
                if (!(difference == 1)) {
                    if (difference == 2 && check == 0) {
                        check++;
                        missingNumber = cardNumbers[i]+1;
                    } else {
                        return "NADA";
                    }
                } else if (cardNumbers[3] == 14 && check == 0) {
                    missingNumber = cardNumbers[0]-1;
                } else if (check == 0){
                    missingNumber = cardNumbers[3]+1;
                }
            }
            //Se pasa el numero por el metodo para convertirlo en su letra o pasarlo a string
            //Y se guarda en la variable missingCard junto al palo del que es
            String missingNum = convertCardToString(missingNumber);
            String cardSymbol = cardsValue[1];
            missingCard = missingNum + " " + cardSymbol;

        } else {
            return "NADA";
        }
        return missingCard;
    }
}