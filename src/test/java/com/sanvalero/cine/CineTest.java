package com.sanvalero.cine;

import com.sanvalero.cine.domain.Sala;
import com.sanvalero.cine.domain.Pelicula;
import com.sanvalero.cine.domain.Trabajador;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CineTest {

    @Test
    public void testConstructorSala() {
        Sala sala = new Sala ("Nombre de la sala", 10, "Zaragoza, 1", 80, (float) 7.5);
        assertEquals("Nombre de la sala", sala.getNombre());
        assertEquals(10, sala.getNumero());
        assertEquals("Zaragoza, 1", sala.getDireccion());
        assertEquals(80, sala.getAforoMaximo());
        assertEquals((float) 7.5, sala.getPantalla());
    }

    @Test
    public void testConstructorPelicula() {
        Pelicula pelicula = new Pelicula ("Título de la película", "Ciencia-ficción", 18, (float) 6.5, (float) 135.2);
        assertEquals("Título de la película", pelicula.getTitulo());
        assertEquals("Ciencia-ficción", pelicula.getGenero());
        assertEquals(18, pelicula.getEdadMinima());
        assertEquals((float) 6.5, pelicula.getPrecio());
        assertEquals((float) 135.2, pelicula.getDuracion());
    }

    @Test
    public void testConstructorTrabajador() {
        Sala sala = new Sala("Nombre de la sala", 10, "Zaragoza, 1", 80, (float)7.5);
        Trabajador trabajador = new Trabajador ("Nombre del trabajador", "123456789A", "correo@email.com", 2, (float) 1265.4, sala);
        assertEquals("Nombre del trabajador", trabajador.getNombre());
        assertEquals("123456789A", trabajador.getDni());
        assertEquals("correo@email.com", trabajador.getEmail());
        assertEquals(2, trabajador.getTurno());
        assertEquals((float) 1265.4, trabajador.getSalario());
        assertEquals("Nombre de la sala", trabajador.getSala().getNombre());
    }

    @Test
    public void testSalaEquals() {
        Sala sala1 = new Sala ("Nombre sala 1", 1, "Dirección sala 1", 80, (float) 7.5);
        Sala sala2 = new Sala ("Nombre sala 2", 2, "Dirección sala 2", 50, (float) 6.5);
        Sala sala3 = new Sala ("Nombre sala 1", 1, "Dirección sala 1", 80, (float) 7.5);
        assertFalse(sala1.equals(sala2));
        assertTrue(sala1.equals(sala3));
        assertFalse(sala2.equals(sala3));
    }

    @Test
    public void testPeliculaEquals() {
        Pelicula pelicula1 = new Pelicula ("Nombre película 1", "Ciencia-ficción", 18, (float) 6.5, (float) 135.2);
        Pelicula pelicula2 = new Pelicula ("Nombre película 2", "Terror", 14, (float) 7.5, (float) 118.6);
        Pelicula pelicula3 = new Pelicula ("Nombre película 1", "Ciencia-ficción", 18, (float) 6.5, (float) 135.2);
        assertFalse(pelicula1.equals(pelicula2));
        assertTrue(pelicula1.equals(pelicula3));
        assertFalse(pelicula2.equals(pelicula3));
    }

    @Test
    public void testTrabajadorEquals() {
        Sala sala = new Sala("Nombre de la sala", 10, "Zaragoza, 1", 80, (float)7.5);
        Trabajador trabajador1 = new Trabajador ("Nombre del trabajador 1", "123456789A", "correo1@email.com", 1, (float) 1265.4, sala);
        Trabajador trabajador2 = new Trabajador ("Nombre del trabajador 2", "987654321A", "correo2@email.com", 2, (float) 1140.2, sala);
        Trabajador trabajador3 = new Trabajador ("Nombre del trabajador 1", "123456789A", "correo1@email.com", 1, (float) 1265.4, sala);
        assertFalse(trabajador1.equals(trabajador2));
        assertTrue(trabajador1.equals(trabajador3));
        assertFalse(trabajador2.equals(trabajador3));
    }
}
