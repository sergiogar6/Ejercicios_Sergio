package org.example;
import java.util.Scanner;

public class UD3Practica3 {
    public void ud3practica() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Introduce el numero de filas: ");
        int row_number = entry.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        int column_number = entry.nextInt();

        //LIMPIAR BUFFER
        entry.nextLine();

        String[][] word_search = new String[row_number][column_number];

        for (int i = 0; i < word_search.length; i++) {

            System.out.println("Introduce las letras de la fila " + (i+1) + ": " );
            String row_letter = entry.nextLine();
            if (!row_letter.matches("[a-zA-Z]+")) {
                System.out.println("FORMATO INCORRECTO");
                return;
            }
            String[] row_letters = row_letter.split(" ");
            if (row_letters.length == word_search[0].length) {
                for (int j = 0; j < word_search[0].length; j++) {
                    word_search[i][j] = row_letters[j];
                }
            } else {
                System.out.println("ERROR. Introduce la cantidad de letras correcta (" + column_number + ").");
                return;
            }
        }

        for (int i = 0; i < word_search.length; i++) {
            for (int j = 0; j < word_search[0].length; j++) {
                System.out.print(word_search[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Introduce la palabra que quieras buscar: ");
        String word = entry.next();
        boolean found_word = true;
        loop1:
        for (int i = 0; i < word_search.length; i++) {
            for (int j = 0; j < word_search[0].length; j++) {

                if (String.valueOf(word.charAt(0)).equals(word_search[i][j]) && (j + word.length()) <= word_search[0].length) {
                    found_word = true;
                    for (int k = 0; k < word.length(); k++) {

                        if (!String.valueOf(word.charAt(k)).equals(word_search[i][j+k])) {
                            found_word = false;
                            break;
                        }
                    }
                    if (found_word) {
                        System.out.println("Palabra encontrada en la posición " + i + " " + j);
                        break loop1;
                    }
                }
                if (String.valueOf(word.charAt(0)).equals(word_search[i][j]) && (i + word.length()) <= word_search[0].length) {
                    found_word = true;
                    for (int k = 0; k < word.length(); k++) {

                        if (!String.valueOf(word.charAt(k)).equals(word_search[i+k][j])) {
                            found_word = false;
                            break;
                        }
                    }
                    if (found_word) {
                        System.out.println("Palabra encontrada en la posición " + i + " " + j);
                        break loop1;
                    }
                }
            }
        }
        if (!found_word) {
            System.out.println("PALABRA NO ENCONTRADA");
        }
    }
}
