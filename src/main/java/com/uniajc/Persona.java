package com.uniajc;

public class Persona {

    // 1. Atributos de la clase Persona
    private String identificacion;
    private String nombre;
    private int edad;

    // 2. Constructores de la clase Persona 

    // Constructor vacio de la clase Persona
    public Persona() {}

    public Persona(String id) {
        this.identificacion = id;
    }

    // Constructor con parametros de la clase Persona
    public Persona(String id, String name, int edad) {
        this.identificacion = id;
        this.nombre = name;
        this.edad = edad;
    }


    // 3. Métodos de la clase Persona

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}
