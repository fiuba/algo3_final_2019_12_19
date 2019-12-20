package ar.uba.fi.algo3.modelo;

public class Mascota implements Deudor {
    private boolean mordio;

    public Mascota() {
        this.mordio = false;
    }
    
    @Override
    public Double deuda(double cuotaAlumno, double cuotaMascota) {
        if (this.mordio) {
            return 2.0 * cuotaMascota;
        }
        return cuotaMascota;
    }

    public void muerde() {
        this.mordio = true;
    }
}
