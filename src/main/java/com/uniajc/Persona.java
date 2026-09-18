package com.uniajc;

public class Persona {

    // 1. Atributos de la clase Persona
    private String identificacion;
    private String nombre;
    private String apellido;          
    private int edad;
    private String fechaNacimiento;   

    // 2. Constructores de la clase Persona 

    // Constructor vacío
    public Persona() {}

    public Persona(String id) {
        this.identificacion = id;
    }

    // Constructor completo con todos los datos 
    public Persona(String id, String nombre, String apellido, int edad, String fechaNacimiento) {
        this.identificacion = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // 3. Métodos Getters y Setters

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    } 
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        if (this.apellido == null || this.apellido.isEmpty()) {
            return this.nombre;
        }
        return this.nombre + " " + this.apellido;
    }

    public int calcularEdad() {
        if (this.fechaNacimiento != null && !this.fechaNacimiento.isEmpty()) {
            String[] fecha = this.fechaNacimiento.split("-");
            int anioNacimiento = Integer.parseInt(fecha[0]);
            int anioActual = java.time.LocalDate.now().getYear();
            return anioActual - anioNacimiento;
        } else {
            return this.edad; 
        }
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre Completo: " + getNombreCompleto());
        System.out.println("Edad registrada: " + this.edad);
        System.out.println("Edad calculada por fecha: " + calcularEdad());
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
    }

    private String caminar() {
        return getNombreCompleto() + " está caminando.";
    }

    public String hablar() {
        return getNombreCompleto() + " está hablando.";
    }

}