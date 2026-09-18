package com.uniajc;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona {

    // 1. Atributos de la clase Persona
    private String identificacion;
    private String nombre;
    private int edad;
    private Date fechaNacimiento;

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

    // constructor con parametros de la clase persona con fecha de nacimiento

    public Persona(String id, String name, int edad, Date fechDate) {
        this.identificacion = id;
        this.nombre = name;
        this.edad = edad;
        this.fechaNacimiento = fechDate;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String calcularEdad() {
    
        if (this.fechaNacimiento == null) {
            return "No tiene fecha de nacimiento registrada. Edad actual: " + this.edad;
        }

        LocalDate fechaNac = this.fechaNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate fechaActual = LocalDate.now();

        this.edad = Period.between(fechaNac, fechaActual).getYears();

        return "La edad calculada es: " + this.edad;
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.err.println("Fecha de Nacimiento: " + this.fechaNacimiento);
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}
