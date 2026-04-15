package edu.ledo.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Set<String> lista = new HashSet<String>();

        for (int i= 1; i<=3;i++) {
            System.out.println("introduce la palabra "+i);
            String palabra = sc.nextLine();
            lista.add(palabra);
        }

        for (String palabra : lista) {
            System.out.println(palabra);
        }

    }

}
