package com.uniajc;

public class Estudiante {

    // Atributos
    private String codigo;
    private String programa;
    private double promedio;

    // Constructor vacío
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(String codigo, String programa, double promedio) {
        this.codigo = codigo;
        this.programa = programa;
        this.promedio = promedio;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para determinar si aprobó
    public void aprobo() {
        if (this.promedio >= 3.0) {
            System.out.println("Estado: " + this.promedio + " - Aprobó"); 
        } else {
            System.out.println("Estado: " + this.promedio + " - Promedio bajo, no alcanza a aprobar");
        }
    }
    

    // Método para mostrar información
    public void mostrarInformacionEstudiante() {
        System.out.println("Código: " + codigo);
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
        aprobo();
       
    }
}
