package com.uniajc; 

public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private Persona profesor;

    public Curso() {
    }

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public void asignarProfesor(Persona profesor) {
        this.profesor = profesor;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Créditos: " + this.creditos);
        if (this.profesor != null) {
            System.out.println("Profesor: " + this.profesor.getNombre());
        } else {
            System.out.println("Profesor: Sin asignar");
        }
    }

    public boolean esElectivo() {
        return this.creditos < 4;
    }
}
