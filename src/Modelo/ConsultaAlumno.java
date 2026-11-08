package Modelo;

import java.util.ArrayList;

public interface ConsultaAlumno {
    // Genera una cadena con toda la información del alumno con codigoDado,
    // incluyendo sus asesorías (una por línea, al final). Si no existe, la
    // cadena contiene un mensaje indicándolo.
    String consultarAlumno(ArrayList<Alumno> datos, String codigoDado);
}
