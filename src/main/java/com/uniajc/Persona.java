package com.uniajc;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String identificacion;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String direccion;
    private long telefono;
    private String correoElectronico;
    private double estatura;

    public Persona() {
    }

    public Persona(String identificacion) {
        this.identificacion = identificacion;
    }

    public Persona(String identificacion, String nombre, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String identificacion, String nombre, int edad, LocalDate fechaNacimiento,
                   String direccion, long telefono, String correoElectronico, double estatura) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estatura = estatura;
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

    public String getNombreCompleto() {
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Correo Electrónico: " + this.correoElectronico);
        System.out.println("Estatura: " + this.estatura);
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

    private String dormir() {
        return this.nombre + " está durmiendo.";
    }

    private String comer() {
        return this.nombre + " está comiendo.";
    }

    private String estudiar() {
        return this.nombre + " está estudiando.";
    }

    public String trabajar() {
        return this.nombre + " está trabajando.";
    }

    public int calcularEdad() {
        if (this.fechaNacimiento == null) {
            return this.edad;
        }
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
}
