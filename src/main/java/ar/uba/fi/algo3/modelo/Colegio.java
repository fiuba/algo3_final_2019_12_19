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
    private List<Mascota> mascotas;

    public Colegio() {

        this.deudores = new LinkedList<>();
        this.mascotas = new LinkedList<>();
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

    public void anotar(Mascota deudor) {
        this.deudores.add(deudor);
        this.mascotas.add(deudor);
    }

    public int mordidas() {
        Integer result = 0;

        for(Mascota m : this.mascotas) {
            if (m.haMordido()) {
                result = result + 1;
            }
        }
        return result;
    }
}
