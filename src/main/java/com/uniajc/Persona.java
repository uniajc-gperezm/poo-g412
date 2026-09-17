package com.uniajc;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // 1. Atributos de la clase Persona
    private String identificacion;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;

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
        this.edad = calcularEdad();
    } 
    
        public Persona(String identificacion,String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.identificacion=identificacion;
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
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
    if (this.fechaNacimiento != null) {
        return calcularEdad();
    }return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
    }

    //metodo para calcular la edad con la fechanacimiento
    public int calcularEdad() {
        if (this.fechaNacimiento == null) {
            return this.edad;
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(this.fechaNacimiento, fechaActual).getYears();
    }

    public void mostrarInformacion() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + calcularEdad() + " años"); 
    }

    private String caminar() {
        return this.nombre + " está caminando.";
    }

    public String hablar() {
        return this.nombre + " está hablando.";
    }
    
}
