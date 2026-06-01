package src.test.java;
import org.junit.jupiter.api.Test;
import upspooejecucion.Actor;
import upspooejecucion.Pelicula;

import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    public void testCrearPelicula() {

        Pelicula p = new Pelicula(
                "Avatar",
                120,
                "Accion",
                "20th Century Studios"
        );

        assertEquals("Avatar", p.getTitulo());
        assertEquals(120, p.getDuracionEnMinutos());
        assertEquals("Accion", p.getGenero());
        assertEquals("20th Century Studios", p.getEstudio());
    }
    @Test
    public void testAgregarActor() {

        Pelicula p = new Pelicula(
                "Avatar",
                120,
                "Accion",
                "20th Century Studios"
        );

        Actor actor = new Actor("Sam Worthington", 40);

        p.agregarActor(actor);

        assertTrue(p.getActores().contains(actor));
    }
}   