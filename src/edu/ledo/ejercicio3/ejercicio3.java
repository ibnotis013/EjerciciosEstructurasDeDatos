package edu.ledo.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {
    static void main() {



        Map<String, Integer> mapa = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        mapa.put("anillo",2);
        mapa.put("pulsera",1);
        mapa.put("piercing",3);
        System.out.println(mapa);

        if(mapa.containsKey("anillo")){
            mapa.put("anillo",mapa.get("anillo")+1);
        }
        System.out.println(mapa);

        for(String key: mapa.keySet()){
            System.out.println(mapa.get(key));
        }

        mapa.remove("pulsera");

        System.out.println(mapa);

    }
}
