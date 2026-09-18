package com.uniajc;

import java.time.LocalDate;

public class Docente {

    private String identificacion;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String materia;
    private double salario;

    public Docente(String identificacion, String nombre, LocalDate fechaNacimiento, String materia, double salario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.materia = materia;
        this.salario = salario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void enseñar() {
        System.out.println(nombre + " está enseñando la materia: " + materia);
    }
}