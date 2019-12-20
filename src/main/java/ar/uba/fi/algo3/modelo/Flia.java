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
        Tarifa tarifa = new TarifaFamiliar(cuotaAlumno, cuotaMascota);

        if (this.integrantes.size() == 2) {

            tarifa = new TarifaParaDos(cuotaAlumno, cuotaMascota);

        } else if (this.integrantes.size() == 3) {

            tarifa = new TarifaParaTres(cuotaAlumno, cuotaMascota);
        }


        return tarifa.valor(this.integrantes);
    }


}
