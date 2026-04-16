package ejercicio4;

import javax.net.ssl.ExtendedSSLSession;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ejercicio4 {
    static void main() {

        Set<String> asignaturas = new HashSet<String>();
        asignaturas.add("Ingles");
        asignaturas.add("Programacion");
        asignaturas.add("Sistemas");
        asignaturas.add("Bases de datos");
        asignaturas.add("lenguajes");

        Estudiante estudiante1=new Estudiante("John");
        Estudiante estudiante2=new Estudiante("Wick");


        System.out.println(asignaturas);

        Ejercicio4.ingresarAsignaturas(estudiante1,asignaturas);

        System.out.println(estudiante1.getTodas());
        System.out.println("antes");
        System.out.println(estudiante1.getAsignaturasAprobadas());
        System.out.println(estudiante1.getAsignaturasPendientes());
        System.out.println("despues");

        cambiarSuspenso(estudiante1);

        System.out.println(estudiante1.getAsignaturasAprobadas());
        System.out.println(estudiante1.getAsignaturasPendientes());

    }

    public static void ingresarAsignaturas(Estudiante estudiante,Set<String> asignaturas) {
        for (String asignatura : asignaturas) {
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
