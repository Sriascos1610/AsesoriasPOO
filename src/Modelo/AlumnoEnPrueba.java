package Modelo;

public class AlumnoEnPrueba extends Alumno {
    private static final long serialVersionUID = 1L;

    private static final int UMBRAL_MINUTOS = 50;

    private double promedio;

    public AlumnoEnPrueba(String codigo, String nombre, double promedio) {
        super(codigo, nombre);
        this.promedio = promedio;
    }

    @Override
    public String calcularAprovechamiento()
    {
        int totalMinutos = 0;
        for (Asesoria obj : susAsesorias)
        {
            totalMinutos += obj.getMinutos();
        }

        String res = "MEJORABLE";
        if (totalMinutos > UMBRAL_MINUTOS)
        {
            res = "BUENO";
        }
        return res;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "  Tipo=En prueba académica  Promedio=" + promedio;
    }
}