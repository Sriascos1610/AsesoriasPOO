package Modelo;

import java.io.Serializable;

public class Asesoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int MINUTOS_UNIDAD_PRESENCIAL = 10;
    private static final int MINUTOS_UNIDAD_VIRTUAL = 5;

    private Asignatura suAsignatura;
    private String modalidad;   // PRESENCIAL o VIRTUAL
    private String fecha;       // formato aaaa-mm-dd
    private int minutos;

    public Asesoria(Asignatura suAsignatura, String modalidad, String fecha, int minutos) {
        this.suAsignatura = suAsignatura;
        this.modalidad = modalidad;
        this.fecha = fecha;
        this.minutos = minutos;
    }

    /*
     * Esfuerzo en unidades completas: una unidad por cada 10 minutos completos
     * si es PRESENCIAL, o una unidad por cada 5 minutos completos si es VIRTUAL.
     * Los minutos restantes que no completen una unidad no se contabilizan
     * (la división entera los descarta).
     */
    public int calcularEsfuerzo()
    {
        int esfuerzo = 0;
        if (modalidad.equalsIgnoreCase("PRESENCIAL"))
        {
            esfuerzo = minutos / MINUTOS_UNIDAD_PRESENCIAL;
        }
        else
        {
            if (modalidad.equalsIgnoreCase("VIRTUAL"))
            {
                esfuerzo = minutos / MINUTOS_UNIDAD_VIRTUAL;
            }
        }
        return esfuerzo;
    }

    public Asignatura getSuAsignatura() {
        return suAsignatura;
    }

    public void setSuAsignatura(Asignatura suAsignatura) {
        this.suAsignatura = suAsignatura;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Asignatura=" + suAsignatura + "  Modalidad=" + modalidad +
                "  Fecha=" + fecha + "  Minutos=" + minutos +
                "  Esfuerzo=" + calcularEsfuerzo();
    }
}
