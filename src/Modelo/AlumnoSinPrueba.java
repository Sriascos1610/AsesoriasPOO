package Modelo;

public class AlumnoSinPrueba extends Alumno {
    private static final long serialVersionUID = 1L;

    private static final int UMBRAL_ASESORIAS = 1;

    private int semestre;

    public AlumnoSinPrueba(String codigo, String nombre, int semestre) {
        super(codigo, nombre);
        this.semestre = semestre;
    }

    @Override
    public String calcularAprovechamiento()
    {
        String res = "NO";
        if (susAsesorias.size() > UMBRAL_ASESORIAS)
        {
            res = "BUENO";
        }
        return res;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "  Tipo=Sin prueba académica  Semestre=" + semestre;
    }
}
