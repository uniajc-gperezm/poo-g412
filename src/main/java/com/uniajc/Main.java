package com.uniajc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona persona1 = new Persona("123456789", "Juan", "Perez", 30, "1996-05-12");
        persona1.setIdentificacion("080990900");

        System.out.println("Imprimiendo información de la persona 1: ");
        persona1.mostrarInformacion(); 
  
        Persona persona2 = new Persona("987654321");
        persona2.setNombre("Maria");
        persona2.setApellido("Gomez");
        persona2.setFechaNacimiento("2000-08-15");

        System.out.println("Imprimiendo información de la persona 2: ");
        System.out.println("Identificación: " + persona2.getIdentificacion() + 
                           ", Nombre Completo: " + persona2.getNombreCompleto() + 
                           ", Edad calculada: " + persona2.calcularEdad());

        Persona persona3 = new Persona();
        persona3.setIdentificacion("123456789");
        persona3.setNombre("Carlos");
        persona3.setApellido("Rodriguez");
        persona3.setFechaNacimiento("1999-03-20");

        System.out.println("Imprimiendo información de la persona 3: ");
        persona3.mostrarInformacion();
    }
}