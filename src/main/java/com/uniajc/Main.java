package com.uniajc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        Date fechaNacimiento1 = formatoFecha.parse("15/05/1995");

        Persona persona1 = new Persona(
                "123456789",
                "Juan Perez",
                fechaNacimiento1
        );

        System.out.println("Imprimiendo información de la persona 1:");
        persona1.mostrarInformacion();

        System.out.println();

        Date fechaNacimiento2 = formatoFecha.parse("20/08/2000");

        Persona persona2 = new Persona(
                "987654321",
                "Maria Gomez",
                fechaNacimiento2
        );

        System.out.println("Imprimiendo información de la persona 2:");
        persona2.mostrarInformacion();

        System.out.println();
        Date fechaNacimiento3 = formatoFecha.parse("10/12/1998");

        Persona persona3 = new Persona(
                "456789123",
                "Carlos Rodriguez",
                fechaNacimiento3
        );

        System.out.println("Imprimiendo información de la persona 3:");
        persona3.mostrarInformacion();

        System.out.println();

        System.out.println("Edad de Juan: " + persona1.calcularEdad());
        System.out.println("Edad de Maria: " + persona2.calcularEdad());
        System.out.println("Edad de Carlos: " + persona3.calcularEdad());
    }
}