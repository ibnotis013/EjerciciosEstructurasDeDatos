package edu.ledo.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {

    private String nombre;
    Set<String> asignaturasAprobadas= new HashSet<String>();
    Set<String> asignaturasPendientes= new HashSet<String>();


    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void cursarAsignaturas(String asignatura, boolean aprobada) {
        //en el ejercicio4 al comenzar estudiando el otro caso nos queda una estructura de control mas resumida
        if (asignaturasAprobadas.contains(asignatura)) {
            System.out.println("ya se ha cursado esta asignatura");
        }
        else{
            if(aprobada){
                if(asignaturasPendientes.contains(asignatura)){
                    asignaturasPendientes.remove(asignatura);
                    System.out.println("ahora esta aprobada");
                }
                asignaturasAprobadas.add(asignatura);
            }
            else{
                asignaturasPendientes.add(asignatura);
            }
        }

    }

    public Set<String> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public Set<String> getAsignaturasPendientes() {
        return asignaturasPendientes;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getTodas() {
        Set<String> conjuntoAsignaturas= new HashSet<>();
        conjuntoAsignaturas.addAll(asignaturasAprobadas);
        conjuntoAsignaturas.addAll(asignaturasPendientes);
        return conjuntoAsignaturas;
    }

    public void mostarEstudiante(){
        System.out.println("el estudiante "+nombre);
        System.out.println("tiene aprobadas las asignaturas "+asignaturasAprobadas);
        System.out.println("y suspensas " + asignaturasPendientes);
    }


}
