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

        Double result = 0.0;

        for (Alumno d : this.integrantes) {
            result = result + d.deuda(cuotaAlumno, cuotaMascota);
        }

        if (this.integrantes.size() == 2) {

            result = valorConDtoPara2(result, cuotaAlumno);
        }
        else if (this.integrantes.size() == 3) {

            result = valorConDtoPara3(result, cuotaAlumno);
        }


        return result;
    }

    private Double valorConDtoPara3(Double valor, double cuotaAlumno) {

        return valor - cuotaAlumno;
    }

    private Double valorConDtoPara2(Double valor, double cuotaAlumno) {
        return (valor - cuotaAlumno) + .75 * cuotaAlumno;
    }
}
