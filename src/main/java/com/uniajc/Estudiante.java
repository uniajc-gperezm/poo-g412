package com.uniajc;

public class Estudiante {
    private String nombre;
    private String codigoEstudiantil;
    private String carrera;

    public Estudiante(String nombre, String codigoEstudiantil, String carrera) {
        this.nombre = nombre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(this.nombre + " está estudiando " + this.carrera);
    }
}