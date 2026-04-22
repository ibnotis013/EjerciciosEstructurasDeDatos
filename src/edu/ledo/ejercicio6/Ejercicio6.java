package edu.ledo.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        List<String> listaComidas = List.of("Caldo","Pollo","Arroz","lentejas","pulpo","merluza","galletas","Caldo","Caldo");

        System.out.println("introduce que comida quieres ver");
        String nombreComida= sc.nextLine();
        int comidaBuscar=0;
        for(String comida: listaComidas){
            if(comida.equals(nombreComida)){
                comidaBuscar++;
            }
        }
        System.out.println(comidaBuscar);
    }



}
