package edu.ledo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    static void main() {

        List<Integer> lista = new ArrayList<Integer>();


        lista.add(1);
        lista.add(4);
        lista.add(3);
        lista.add(9);
        lista.add(5);
        lista.add(7);
        System.out.println("Lista de numeros");
        int sumaNumeros=0;
        int numeroMayor=lista.get(0);
        for (Integer numero: lista) {
            System.out.println(numero);
            sumaNumeros += numero;
            if (numeroMayor<=numero){
                numeroMayor=numero;
            }
        }

        System.out.println(lista.size());
        System.out.println(sumaNumeros);
        System.out.println(numeroMayor);

    }
}
