package com.sanvalero.cine;

import com.sanvalero.cine.domain.Sala;
import com.sanvalero.cine.domain.Pelicula;
import com.sanvalero.cine.domain.Trabajador;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ConstructorTest {

    private static Sala sala;

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
        Trabajador trabajador = new Trabajador ("Nombre del trabajador", "123456789A", "correo@email.com", 2, (float) 1265.4);
        assertEquals("Nombre del trabajador", trabajador.getNombre());
        assertEquals("123456789A", trabajador.getDni());
        assertEquals("correo@email.com", trabajador.getEmail());
        assertEquals(2, trabajador.getTurno());
        assertEquals((float) 1265.4, trabajador.getSalario());
    }

    @Test
    public void testSalaEquals() {
        Sala sala1 = new Sala ("Nombre sala 1", 1, "Dirección sala 1", 80, (float) 7.5);
        Sala sala2 = new Sala ("Nombre sala 2", 2, "Dirección sala 2", 50, (float) 6.5);
        Sala sala3 = new Sala ("Nombre sala 1", 1, "Dirección sala 1", 80, (float) 7.5);
        assertEquals(true, sala1.equals(sala2));
    }
}
