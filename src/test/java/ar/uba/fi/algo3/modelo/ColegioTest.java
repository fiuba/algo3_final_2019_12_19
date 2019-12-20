package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColegioTest {

	@Test
    public void conCuatroAlumnosNoHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        nacional.anotar( new Alumno());
        nacional.anotar( new Alumno());
        nacional.anotar( new Alumno());
        nacional.anotar( new Alumno());

        assertEquals(400, nacional.deudaAcumulada());
    }
	
    @Test
    public void conDosAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Flia sabatini = new Flia("Sabatini");

        sabatini.conformar(new Alumno("gabi"));
        sabatini.conformar(new Alumno("ova"));

        nacional.anotar(sabatini);

        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(175, nacional.deudaAcumulada());
    }

    @Test
    public void conTresAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();


        Flia sabatini = new Flia("Sabatini");

        sabatini.conformar(new Alumno("gabi"));
        sabatini.conformar(new Alumno("ova"));
        sabatini.conformar(new Alumno("quique"));

        nacional.anotar(sabatini);

        // Cuando hay tres hermanos, uno de ellos no paga
        assertEquals(200, nacional.deudaAcumulada());
    }

    @Test
    public void conMascotaNoMuerdeLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Mascota tanino = new Mascota();

        nacional.anotar(tanino);

        // Una mascota que NO muerde paga la cuota estipulada
        assertEquals(150, nacional.deudaAcumulada());
    }

    @Test
    public void conMascotaMuerdeLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Mascota tanino = new Mascota();

        tanino.muerde();

        nacional.anotar(tanino);

        // Una mascota que SI muerde paga la cuota estipulada * 2
        assertEquals(300, nacional.deudaAcumulada());
    }


}
