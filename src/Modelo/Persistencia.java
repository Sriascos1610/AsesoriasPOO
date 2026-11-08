package Modelo;

import java.util.ArrayList;

public interface Persistencia {
    // Almacena los alumnos (con sus asesorías) y las asignaturas
    void almacenarArchivoObjetos(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas);

    // Recupera los alumnos (con sus asesorías) y las asignaturas
    void recuperarArchivoObjetos(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas);
}