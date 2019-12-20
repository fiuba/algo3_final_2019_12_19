package ar.uba.fi.algo3.modelo;

public class Alumno implements Deudor {

    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno() {
        this.nombre = "NN";

    }

    @Override
    public Double deuda(double cuotaAlumno, double cuotaMascota) {
        return cuotaAlumno;
    }
}
