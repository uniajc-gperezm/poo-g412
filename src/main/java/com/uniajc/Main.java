package com.uniajc;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona persona1 = new Persona("123456789", "Juan Perez", 30);
        persona1.setIdentificacion("080990900");

        System.out.println("Imprimiendo información de la persona 1: ");
        System.out.println(persona1);

        Persona persona2 = new Persona("987654321");
        persona2.setNombre("Maria Gomez");

        System.out.println("Imprimiendo información de la persona 2: ");
        System.out.println("Identificación: " + persona2.getIdentificacion() + ", Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());


        Persona persona3 = new Persona();
        persona3.setIdentificacion("123456789");
        persona3.setNombre("Carlos Rodriguez");
        persona3.setEdad(25);

        System.out.println("Imprimiendo información de la persona 3: ");
        persona3.mostrarInformacion();

        Persona persona4 = new Persona();
        persona4.setIdentificacion("123456789");
        persona4.setNombre("Carlos Rodriguez");
        Calendar cal = Calendar.getInstance();
        cal.set(2003, Calendar.APRIL, 23); 
        Date fechaNacimiento = cal.getTime();
        persona4.setFechaNacimiento(fechaNacimiento);

        System.out.println("Imprimiendo información de la persona 4: " );
        persona4.calcularEdad();
        persona4.mostrarInformacion();

        Sede sede1 = new Sede();
        sede1.setNombre("Norte");
        sede1.setDireccion("Avenida 6N No 28N-102");
        sede1.setCiudad("Cali");
        System.out.println("Imprimiendo sede");
        sede1.mostrarInformacion();

    }
}