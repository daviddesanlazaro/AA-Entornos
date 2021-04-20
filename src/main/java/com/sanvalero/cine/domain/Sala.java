package com.sanvalero.cine.domain;

public class Sala {

    private String nombre;
    private int numero;
    private String direccion;
    private int aforoMaximo;
    private float pantalla;


    // Constructor

    public Sala(String nombre, int numero, String direccion, int aforoMaximo, float pantalla) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        this.aforoMaximo = aforoMaximo;
        this.pantalla = pantalla;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public float getPantalla() {
        return pantalla;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala sala = (Sala) object;
        if (numero != sala.getNumero()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return String.valueOf("Sala " + numero);
    }

}