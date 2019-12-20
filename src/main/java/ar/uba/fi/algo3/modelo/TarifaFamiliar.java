package ar.uba.fi.algo3.modelo;

import java.util.List;

public class TarifaFamiliar implements Tarifa{
    private double cuotaAlumno;
    private double cuotaMascota;

    public TarifaFamiliar(double cuotaAlumno, double cuotaMascota) {

        this.cuotaAlumno = cuotaAlumno;
        this.cuotaMascota = cuotaMascota;
    }

    @Override
    public Double valor(List<Alumno> integrantes) {
        Double result = 0.0;
        for (Alumno d : integrantes) {
            result = result + d.deuda(cuotaAlumno, cuotaMascota);
        }


        return result;
    }
}
