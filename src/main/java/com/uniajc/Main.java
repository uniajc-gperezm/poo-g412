package com.uniajc;

import java.time.LocalDate;

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

        Persona persona4 = new Persona(
                "13",
                "Gian Carlos",
                21,
                LocalDate.of(2004, 9, 24),
                "calle 72E N76",
                3106586833L,
                "camaleon@gmail.com",
                1.95
        );

        System.out.println("Imprimiendo información de la persona 4: ");
        persona4.mostrarInformacion();
        System.out.println("Edad calculada persona4: " + persona4.calcularEdad());
    }
}