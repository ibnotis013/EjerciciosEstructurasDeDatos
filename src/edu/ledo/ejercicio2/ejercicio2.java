package edu.ledo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {
    static void main() {

        List<Integer> lista = new ArrayList<Integer>();


        lista.add(1);
        lista.add(4);
        lista.add(3);
        lista.add(9);
        lista.add(5);
        lista.add(7);
        System.out.println("Lista de numeros");
        int numerosTotal = 0;
        int sumaNumeros=0;
        int numeroMayor=lista.get(0);
        for (Integer numeros: lista) {
            System.out.println(numeros);
            numerosTotal ++;
            sumaNumeros += numeros;
            if (numeroMayor<=numeros){
                numeroMayor=numeros;
            }
        }

        System.out.println(numerosTotal);
        System.out.println(sumaNumeros);
        System.out.println(numeroMayor);

    }
}
