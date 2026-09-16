package com.uniajc;

public class Estudiante {

    private String nombre;
    private int edad;
    private String codigoEstudiantil;
    private String programaAcademico;
    private double promedioAcademico;

    public Estudiante() {}

    public Estudiante(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public Estudiante(String nombre, int edad, String codigoEstudiantil, String programaAcademico, double promedioAcademico) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigoEstudiantil = codigoEstudiantil;
        this.programaAcademico = programaAcademico;
        this.promedioAcademico = promedioAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    } 

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Código Estudiantil: " + this.codigoEstudiantil);
        System.out.println("Programa Académico: " + this.programaAcademico);
        System.out.println("Promedio Académico: " + this.promedioAcademico);
    }

    private String matricularMaterias() {
        return "El estudiante " + this.nombre + " con código " + this.codigoEstudiantil + " ha matriculado sus materias.";
    }

    public String estudiar() {
        return "El estudiante " + this.nombre + " está cursando el programa de " + this.programaAcademico + ".";
    }
}
