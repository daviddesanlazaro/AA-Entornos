package com.sanvalero.cine.domain;

public class Pelicula {

    private String titulo;
    private String genero;
    private int edadMinima;
    private float precio;
    private float duracion;


    // Constructor

    public Pelicula(String titulo, String genero, int edadMinima, float precio, float duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.edadMinima = edadMinima;
        this.precio = precio;
        this.duracion = duracion;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public float getPrecio() {
        return precio;
    }

    public float getDuracion() {
        return duracion;
    }

    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) object;
        if (titulo != pelicula.getTitulo()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return titulo;
    }
}