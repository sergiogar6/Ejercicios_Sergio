package org.example;

public class Ternarias {
    public void ud2ejercicio() {
        int a = 3, b = 2, c = 1;

        int resultado = a-- > b && c > b-- ? a += c++ :
                        c++ == b && a < c++ ? c -= a-- :
                        a < c && b++ < a++ ? a += c-- : a++ ;

        System.out.println(resultado);
    }
}