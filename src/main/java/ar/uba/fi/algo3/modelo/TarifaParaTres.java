package ar.uba.fi.algo3.modelo;

import java.util.List;

public class TarifaParaTres implements Tarifa {
    private final TarifaFamiliar tarifaFamiliar;
    private final double cuotaAlumno;

    public TarifaParaTres(double cuotaAlumno, double cuotaMascota) {
        this.tarifaFamiliar = new TarifaFamiliar(cuotaAlumno, cuotaMascota);

        this.cuotaAlumno = cuotaAlumno;

    }

    @Override
    public Double valor(List<Alumno> integrantes) {
        Double valor = this.tarifaFamiliar.valor(integrantes);

        return valorConDtoPara3(valor, cuotaAlumno);
    }

    private Double valorConDtoPara3(Double valor, double cuotaAlumno) {

        return valor - cuotaAlumno;
    }

}
