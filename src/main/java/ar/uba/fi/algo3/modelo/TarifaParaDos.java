package ar.uba.fi.algo3.modelo;

import java.util.List;

public class TarifaParaDos implements Tarifa {
    private final TarifaFamiliar tarifaFamiliar;
    private final double cuotaAlumno;


    public TarifaParaDos(double cuotaAlumno, double cuotaMascota) {
        this.tarifaFamiliar = new TarifaFamiliar(cuotaAlumno, cuotaMascota);

        this.cuotaAlumno = cuotaAlumno;
    }

    @Override
    public Double valor(List<Alumno> integrantes) {
        Double valor = this.tarifaFamiliar.valor(integrantes);

        return valorConDtoPara2(valor, cuotaAlumno);
    }

    private Double valorConDtoPara2(Double valor, double cuotaAlumno) {

        return (valor - cuotaAlumno) + .75 * cuotaAlumno;
    }

}
