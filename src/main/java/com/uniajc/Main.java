package com.uniajc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona persona1 = new Persona("123456789", "Juan Perez", LocalDate.of(2008, 12, 23));
        persona1.setIdentificacion("080990900");

        System.out.println("Imprimiendo información de la persona 1: ");
        System.out.println("Identificación: " + persona1.getIdentificacion() + ", Nombre: " + persona1.getNombre() + ", Edad: " + persona1.getEdad());

        Persona persona2 = new Persona("987654321", "Maria Gomez", LocalDate.of(1999, 1, 30));
        persona2.setNombre("Maria Gomez");

        System.out.println("Imprimiendo información de la persona 2: ");
        System.out.println("Identificación: " + persona2.getIdentificacion() + ", Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());


        Persona persona3 = new Persona();
        persona3.setIdentificacion("123456789");
        persona3.setNombre("Carlos Rodriguez");
        persona3.setFechaNacimiento(LocalDate.of(2000, 6, 3));

        System.out.println("Imprimiendo información de la persona 3: ");
        persona3.mostrarInformacion();
    }
}