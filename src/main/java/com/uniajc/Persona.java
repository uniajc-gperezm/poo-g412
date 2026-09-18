package com.uniajc;

import java.time.LocalDate;   //para la fecha
import java.time.Period;     //para calcular edad

public class Persona {

    // 1. Atributos de la clase Persona
    private String identificacion;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;  //atributo fecha de nacimiento

    // 2. Constructores de la clase Persona 

    // Constructor vacio de la clase Persona
    public Persona() {}

    public Persona(String id) {
        this.identificacion = id;
    }

    // Constructor con parametros de la clase Persona
    public Persona(String id, String name, LocalDate fechaNacimiento) {
        this.identificacion = id;
        this.nombre = name;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(); //Calcula la edad automáticamente
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
        if (edad == 0) {
            edad = calcularEdad(); //Si no esta calculada, la calcula
        }
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para calcular la edad
    public int calcularEdad() {
        if (fechaNacimiento == null) {
            return 0;
        }
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }

    //Getter y Setter para fechaNacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(); //Actualiza la edad al cambiar la fecha
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + getEdad()); //Usa getEdad() para que este actualizada
        if (fechaNacimiento != null) {
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        }
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }

}