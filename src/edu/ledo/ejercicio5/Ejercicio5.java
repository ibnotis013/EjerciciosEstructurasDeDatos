package edu.ledo.ejercicio5;

import java.util.*;

/*public class Ejercicio5 {
    static void main() {

        Set<String> asignaturas=new HashSet<>();

        asignaturas.add("Ingles");
        asignaturas.add("Programacion");
        asignaturas.add("Sistemas");
        asignaturas.add("Bases de datos");
        asignaturas.add("lenguajes");

        Estudiante estudiante1=new Estudiante("John");
        Estudiante estudiante2=new Estudiante("Wick");


        System.out.println(asignaturas);

        Ejercicio5.ingresarAsignaturas(estudiante1,asignaturas);

        System.out.println(estudiante1.getTodas());
        System.out.println("antes");
        System.out.println(estudiante1.getAsignaturasAprobadas());
        System.out.println(estudiante1.getAsignaturasPendientes());
        System.out.println("despues");

        cambiarSuspenso(estudiante1);

        System.out.println(estudiante1.getAsignaturasAprobadas());
        System.out.println(estudiante1.getAsignaturasPendientes());

    }

    public static void ingresarAsignaturas(Estudiante estudiante, Map notas) {
        for (String asignatura : ) {
            Random random = new Random();
            boolean valorAleatorio = random.nextBoolean();
            if (valorAleatorio) {
                estudiante.asignaturasAprobadas.add(asignatura);
            }
            else{
                estudiante.asignaturasPendientes.add(asignatura);
            }
        }
    }

    public static void cambiarSuspenso(Estudiante estudiante) {
        List<String> lista = estudiante.getAsignaturasPendientes().stream().toList();

        estudiante.asignaturasPendientes.remove(lista.get(0));
        estudiante.asignaturasAprobadas.add(lista.get(0));
    }
}
*/