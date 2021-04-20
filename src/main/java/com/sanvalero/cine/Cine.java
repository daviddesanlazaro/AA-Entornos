package com.sanvalero.cine;

import java.util.InputMismatchException;
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
    boolean crearSala = false;
    boolean crearPelicula = false;
    boolean crearTrabajador = false;


    public Cine() {

    }

    public void ejecutar() {
        do {
            opcion = introducirTecla();
            switch (opcion) {
                case "1":
                    crearSala = introducirSala();
                    break;
                case "2":
                    consultarSala();
                    break;
                case "3":
                    crearPelicula = introducirPelicula();
                    break;
                case "4":
                    consultarPelicula();
                    break;
                case "5":
                    crearTrabajador = introducirTrabajador();
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

    private boolean introducirSala() {     // Introducir información de una sala

        System.out.println("Introduce el nombre de la sala");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el número de la sala");
        int numero = Math.round(introducirFloat(true, false));
        System.out.println("Introduce la dirección de la sala");
        String direccion = teclado.nextLine();
        System.out.println("Introduce el aforo máximo de la sala");
        int aforoMaximo = Math.round(introducirFloat(true, false));
        System.out.println("Introduce el tamaño de pantalla de la sala en metros cuadrados");
        float pantalla = introducirFloat(false, false);

        sala = new Sala(nombre, numero, direccion, aforoMaximo, pantalla);

        return crearSala = true;
    }

    private void consultarSala() {      // Mostrar información de una sala
        if (crearSala) {
            System.out.println("Nombre: " + sala.getNombre());
            System.out.println("Número de sala: " + sala.getNumero());
            System.out.println("Dirección: " + sala.getDireccion());
            System.out.println("Aforo máximo: " + sala.getAforoMaximo() + " personas");
            System.out.println("Tamaño de la pantalla: " + sala.getPantalla() + " m2");
        } else {
            System.out.println("No hay ninguna sala");
        }
    }

    private boolean introducirPelicula() {     // Introducir información de una película
        System.out.println("Introduce el título de la película");
        String titulo = teclado.nextLine();
        System.out.println("Introduce el género de la película");
        String genero = teclado.nextLine();
        System.out.println("Introduce la edad mínima para ver la película");
        int edadMinima = Math.round(introducirFloat(true, true));   // Admite un 0
        System.out.println("Introduce el precio de la entrada en euros");
        float precio = introducirFloat(false, false);
        System.out.println("Introduce la duración de la película en minutos");
        float duracion = introducirFloat(false, false);

        pelicula = new Pelicula(titulo, genero, edadMinima, precio, duracion);

        return crearPelicula = true;
    }

    private void consultarPelicula() {      // Mostrar información de una película
        if (crearPelicula) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Edad mínima: " + pelicula.getEdadMinima() + " años");
            System.out.println("Precio de la entrada: " + pelicula.getPrecio() + " €");
            System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
        } else {
            System.out.println("No hay ninguna película");
        }
    }

    private boolean introducirTrabajador() {       // Introducir información de un trabajador
        System.out.println("Introduce el nombre del trabajador");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el DNI del trabajador");
        String dni = teclado.nextLine();
        System.out.println("Introduce el email del trabajador");
        String email = teclado.nextLine();
        System.out.println("Introduce el turno del trabajador");
        int turno = Math.round(introducirFloat(true, false));
        System.out.println("Introduce el salario del trabajador en euros");
        float salario = introducirFloat(false, false);
        System.out.println("Introduce el numero de sala");
        String nombreSala = teclado.nextLine();

        Sala sala = new Sala(nombreSala, 0, null, 0, 0);
        trabajador = new Trabajador(nombre, dni, email, turno, salario, sala);

        return crearTrabajador = true;
    }

    private void consultarTrabajador() {        // Mostrar información de un trabajador
        if (crearTrabajador) {
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("DNI: " + trabajador.getDni());
            System.out.println("Email: " + trabajador.getEmail());
            System.out.println("Turno: " + trabajador.getTurno());
            System.out.println("Salario: " + trabajador.getSalario() + " €");
            System.out.println("Nombre de la sala: " + trabajador.getSala().getNombre());
        } else {
            System.out.println("No hay ningún trabajador");
        }
    }

    private String introducirTecla() {      //  Seleccionar opción
        System.out.println("Elige una opción:");
        System.out.println("1. Introducir sala");
        System.out.println("2. Consultar sala");
        System.out.println("3. Introducir película");
        System.out.println("4. Consultar pelíula");
        System.out.println("5. Introducir trabajador");
        System.out.println("6. Consultar trabajdor");
        System.out.println("9. Salir");
        opcion = teclado.nextLine();
        return opcion;
    }

    private float introducirFloat(boolean entero, boolean admiteCero) {
        float numero = 0;
        boolean cero = false;
        do {
            try {
                if (entero) {
                    numero = teclado.nextInt();
                } else {
                    numero = teclado.nextFloat();
                }
                if ((numero != 0) || (admiteCero)) {    // Algunos atributos admiten un 0
                    cero = true;
                } else {
                    System.out.println("Debes introducir un número distinto de 0");
                }
            } catch (InputMismatchException ime) {
                if (entero) {
                    System.err.println("Debes introducir un número entero");
                } else {
                    System.err.println("Debes introducir un número");
                }
                teclado.nextLine();
            }
        } while (!cero);

        teclado.nextLine();     // Reinicia el output
        return numero;
    }
}
