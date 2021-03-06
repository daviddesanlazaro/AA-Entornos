package com.sanvalero.cine.domain;

public class Trabajador {

    private String nombre;
    private String dni;
    private String email;
    private int turno;
    private float salario;
    private Sala sala;


    // Constructor

    public Trabajador(String nombre, String dni, String email, int turno, float salario, Sala sala) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.turno = turno;
        this.salario = salario;
        this.sala = sala;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public int getTurno() {
        return turno;
    }

    public float getSalario() {
        return salario;
    }

    public Sala getSala() {
        return sala;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador trabajador = (Trabajador) object;
        if (dni != trabajador.getDni()) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(nombre);
    }
}