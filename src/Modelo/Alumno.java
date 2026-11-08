package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String codigo;
    protected String nombre;
    protected ArrayList<Asesoria> susAsesorias;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.susAsesorias = new ArrayList<>();
    }

    /*
     * Adiciona nvaAsesoria AL INICIO de las asesorías que tiene el alumno y
     * retorna el esfuerzo correspondiente a dicha asesoría.
     */
    public int adicionarAsesoria(Asesoria nvaAsesoria)
    {
        susAsesorias.add(0, nvaAsesoria);
        return nvaAsesoria.calcularEsfuerzo();
    }

    public abstract String calcularAprovechamiento();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asesoria> getSusAsesorias() {
        return susAsesorias;
    }

    public void setSusAsesorias(ArrayList<Asesoria> susAsesorias) {
        this.susAsesorias = susAsesorias;
    }

    @Override
    public String toString() {
        return "Código=" + codigo + "  Nombre=" + nombre;
    }
}
