package Modelo;

import java.util.ArrayList;

public interface ListadoAlumnos {
    // Genera una cadena con el código, nombre, aprovechamiento calculado y
    // número de asesorías recibidas de cada alumno de datos.
    String listarAlumnos(ArrayList<Alumno> datos);
}