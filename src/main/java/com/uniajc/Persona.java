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

    // Constructor con fecha de nacimiento
    public Persona(String id, String name, Date fechaNacimiento) {
        this.identificacion = id;
        this.nombre = name;
        this.fechaNacimiento = fechaNacimiento;
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

    // Método para calcular la edad según la fecha de nacimiento
    public int calcularEdad() {

        if (fechaNacimiento == null) {
            return 0;
        }

        Calendar fechaActual = Calendar.getInstance();
        Calendar nacimiento = Calendar.getInstance();

        nacimiento.setTime(fechaNacimiento);

        int edadCalculada = fechaActual.get(Calendar.YEAR)
                - nacimiento.get(Calendar.YEAR);

        // Verificar si ya cumplió años este año
        if (fechaActual.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH)
                || (fechaActual.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {

            edadCalculada--;
        }

        return edadCalculada;
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        System.out.println("Edad: " + calcularEdad());
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}

