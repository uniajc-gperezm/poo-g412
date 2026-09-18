package com.uniajc;

public class Estudiante extends Persona {

    private String universidad;
    private String carrera;
    private int semestre;

    public Estudiante(String id, String nombre, int edad, String universidad, String carrera, int semestre) {
        super(id, nombre, edad);
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
    }