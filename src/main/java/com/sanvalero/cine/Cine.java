package com.sanvalero.cine;

import java.util.Scanner;
import com.sanvalero.cine.domain.Sala;
import com.sanvalero.cine.domain.Pelicula;
import com.sanvalero.cine.domain.Trabajador;

public class Cine {

    // Variables
    Scanner teclado = new Scanner(System.in);
    Sala sala;
    Pelicula pelicula;
    Trabajador trabajador;
    String opcion;
    boolean salir = false;


    public Cine() {

    }

    public void ejecutar() {
        do {
            opcion = introducirTecla();
            switch (opcion) {
                case "1":
                    introducirSala();
                    break;
                case "2":
                    consultarSala();
                    break;
                case "3":
                    introducirPelicula();
                    break;
                case "4":
                    consultarPelicula();
                    break;
                case "5":
                    introducirTrabajador();
                    break;
                case "6":
                    consultarTrabajador();
                    break;
                case "9":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private void introducirSala() {     // Introducir información de una sala
        System.out.println("Introduce el nombre de la sala");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el número de la sala");
        int numero = teclado.nextInt();
        System.out.println("Introduce la dirección de la sala");
        String direccion = teclado.nextLine();
        System.out.println("Introduce el aforo máximo de la sala");
        int aforoMaximo = teclado.nextInt();
        System.out.println("Introduce el tamaño de la pantalla de la sala");
        float pantalla = teclado.nextFloat();
        teclado.nextLine();     // Reinicia el input

        sala = new Sala(nombre, numero, direccion, aforoMaximo, pantalla);
    }

    private void consultarSala() {      // Mostrar información de una sala
        System.out.println("Nombre: " + sala.getNombre());
        System.out.println("Número de sala: " + sala.getNumero());
        System.out.println("Dirección: " + sala.getDireccion());
        System.out.println("Aforo máximo: " + sala.getAforoMaximo());
        System.out.println("Tamaño de la pantalla: " + sala.getPantalla());
    }

    private void introducirPelicula() {     // Introducir información de una película
        System.out.println("Introduce el título de la película");
        String titulo = teclado.nextLine();
        System.out.println("Introduce el director de la película");
        String genero = teclado.nextLine();
        System.out.println("Introduce la edad mínima para ver la película");
        int edadMinima = teclado.nextInt();
        System.out.println("Introduce el precio de la entrada");
        float precio = teclado.nextFloat();
        System.out.println("Introduce la duración de la película");
        float duracion = teclado.nextFloat();
        teclado.nextLine();     // Reinicia el input

        pelicula = new Pelicula(titulo, genero, edadMinima, precio, duracion);
    }

    private void consultarPelicula() {      // Mostrar información de una película
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Edad mínima: " + pelicula.getEdadMinima());
        System.out.println("Precio de la entrada: " + pelicula.getPrecio());
        System.out.println("Duración: " + pelicula.getDuracion());
    }

    private void introducirTrabajador() {       // Introducir información de un trabajador
        System.out.println("Introduce el nombre del trabajador");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el DNI del trabajador");
        String dni = teclado.nextLine();
        System.out.println("Introduce el email del trabajador");
        String email = teclado.nextLine();
        System.out.println("Introduce el turno del trabajador");
        int turno = teclado.nextInt();
        System.out.println("Introduce el salario del trabajador");
        float salario = teclado.nextFloat();
        teclado.nextLine();     // Reinicia el input

        trabajador = new Trabajador(nombre, dni, email, turno, salario);
    }

    private void consultarTrabajador() {        // Mostrar información de un trabajador
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("DNI: " + trabajador.getDni());
        System.out.println("Email: " + trabajador.getEmail());
        System.out.println("Turno: " + trabajador.getTurno());
        System.out.println("Salario: " + trabajador.getSalario());
    }

    private String introducirTecla() {      //  Seleccionar opción
        System.out.println("Elige una opción:");
        System.out.println("1. Introducir sala");
        System.out.println("2. Consultar sala");
        System.out.println("3. Introducir película");
        System.out.println("4. Consultar película");
        System.out.println("5. Introducir trabajador");
        System.out.println("6. Consultar trabajdor");
        System.out.println("9. Salir");
        opcion = teclado.nextLine();
        return opcion;
    }
}
