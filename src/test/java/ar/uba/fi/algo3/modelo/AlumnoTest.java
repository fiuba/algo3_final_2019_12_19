package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    public void unAlumnoPagaCuotaCompleta()
    {
        Alumno a = new Alumno("gabi");

        assertEquals(100, a.deuda(100, 150));
    }

}
