package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;
import java.util.List;

public class Flia implements Deudor {
    private String apellido;
    private List<Alumno> integrantes;

    public Flia(String sabatini) {
        this.apellido = sabatini;

        this.integrantes = new LinkedList<>();

    }

    public void conformar(Alumno integrante) {

        this.integrantes.add(integrante);
    }


    @Override
    public Double deuda(double cuotaAlumno, double cuotaMascota) {
        TarifaFamiliar tarifa = new TarifaFamiliar(cuotaAlumno, cuotaMascota);
        Double result = 0.0;

        result = tarifa.valor(this.integrantes);


        if (this.integrantes.size() == 2) {

            result = new TarifaParaDos(cuotaAlumno, cuotaMascota).valor(this.integrantes);
        } else if (this.integrantes.size() == 3) {

            result = new TarifaParaTres(cuotaAlumno, cuotaMascota).valor(this.integrantes);
        }


        return result;
    }


}
