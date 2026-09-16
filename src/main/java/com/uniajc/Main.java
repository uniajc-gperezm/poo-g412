package com.uniajc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        LocalDate fecha1 = LocalDate.of(1996, 5, 10);
        Persona persona1 = new Persona("123456789", "Juan Perez", 30);
        persona1.setIdentificacion("080990900");

        System.out.println("Imprimiendo información de la persona 1: ");
        persona1.mostrarInformacion();

        System.out.println("-----------------------------------");

        Persona persona2 = new Persona("987654321");
        persona2.setNombre("Maria Gomez");
        persona2.setFechaNacimiento(LocalDate.of(2006, 8, 20));

        System.out.println("Imprimiendo información de la persona 2: ");
        System.out.println("Identificación: " + persona2.getIdentificacion() + 
                           ", Nombre: " + persona2.getNombre() + 
                           ", Fecha Nac: " + persona2.getFechaNacimiento() +
                           ", Edad: " + persona2.getEdad());
        
        System.out.println("-----------------------------------");

        Persona persona3 = new Persona();
        persona3.setIdentificacion("123456789");
        persona3.setNombre("Carlos Rodriguez");
        persona3.setFechaNacimiento(LocalDate.of(2001, 2, 15));

        System.out.println("Imprimiendo información de la persona 3: ");
        persona3.mostrarInformacion();


    }

}
