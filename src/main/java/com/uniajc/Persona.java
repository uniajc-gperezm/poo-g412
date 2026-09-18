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

    // Constructor con fecha de nacimiento
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

    // Método para calcular la edad a partir de la fecha de nacimiento
   public int calcularEdad() {
        if (fechaNacimiento == null) {
            return 0;
        }
        LocalDate nacimiento = fechaNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate hoy = LocalDate.now();
        return Period.between(nacimiento, hoy).getYears();
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}