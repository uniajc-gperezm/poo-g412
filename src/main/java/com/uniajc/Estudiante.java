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

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void estudiar() {
        System.out.println(getNombre() + " está estudiando " + carrera + " en " + universidad);
    }
}