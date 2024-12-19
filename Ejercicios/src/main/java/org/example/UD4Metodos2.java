package org.example;

public class UD4Metodos2 {
    public static void MostrarMenu() {

        showMenu();
        int option = Reusable.saveNumber();
    }

    public static void showMenu() {
        System.out.println("---MENU---");
        System.out.println("1. Programación");
        System.out.println("2. Entornos");
        System.out.println("3. Salir");
        }

    public static void checkOption(int option) {
        if (option == 3) {
            return;
        }
    }

    public static void menuLoop() {

    }
}
