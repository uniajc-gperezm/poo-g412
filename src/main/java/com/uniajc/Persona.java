package com.uniajc;

import java.util.Date;
import java.util.Calendar;

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

    public Persona(String id, String name, Date fechaNacimiento) {
        this.identificacion = id;
        this.nombre = name;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
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
        this.edad = calcularEdad();
    }

    public int calcularEdad() {
        if (this.fechaNacimiento == null) return 0;
        Calendar calNacimiento = Calendar.getInstance();
        calNacimiento.setTime(this.fechaNacimiento);
        Calendar calActual = Calendar.getInstance();
        int edad = calActual.get(Calendar.YEAR) - calNacimiento.get(Calendar.YEAR);
        if (calActual.get(Calendar.DAY_OF_YEAR) < calNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        if (this.fechaNacimiento != null) {
            System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        }
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}
