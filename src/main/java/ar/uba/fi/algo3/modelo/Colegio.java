package ar.uba.fi.algo3.modelo;

import javax.management.AttributeList;
import java.awt.peer.ChoicePeer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Colegio {
    private static final double CUOTA_ALUMNO = 100.0;
    private static final double CUOTA_MASCOTA = 150.0;

    private List<Deudor> deudores;

    public Colegio() {

        this.deudores = new LinkedList<>();
    }

    public void anotar(Alumno alumno) {
        this.deudores.add(alumno);
    }

    public Double deudaAcumulada() {

        Double result = 0.0;

        for (Deudor a : this.deudores) {
            result = result + a.deuda(CUOTA_ALUMNO, CUOTA_MASCOTA);
        }

        return result;
    }

    public void anotar(Deudor deudor) {
        this.deudores.add(deudor);
    }
}
