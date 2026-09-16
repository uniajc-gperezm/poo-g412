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
    
    
}
