package com.uniajc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1. Persona 1 con sus 4 datos (incluyendo la fecha)
        Persona persona1 = new Persona("123456789", "Juan Perez", 30, "2005-05-12");
        persona1.setIdentificacion("080990900");

        System.out.println("Imprimiendo información de la persona 1: ");
        persona1.mostrarInformacion(); 

        // 2. Persona 2 usando el constructor de ID y los setters
        Persona persona2 = new Persona("987654321"); 
        persona2.setNombre("Maria Gomez");

        System.out.println("Imprimiendo información de la persona 2: ");
        System.out.println("Identificación: " + persona2.getIdentificacion() + ", Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());

        // 3. Persona 3
        Persona persona3 = new Persona();
        persona3.setIdentificacion("123456789");
        persona3.setNombre("Carlos Rodriguez");
    }
}