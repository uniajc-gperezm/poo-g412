package com.uniajc;

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

        System.out.println("Imprimiendo información de la persona 4: ");
        Persona persona4 =new Persona("111024567","Eva",2007,11,14);
        persona4.mostrarInformacion();

        //agrgando datos estudiante 
        Estudiante est1 =new Estudiante("102993","TIC",4.0);
        System.out.println("info estudiante: ");
        est1.mostrarInformacionEstudiante();

    }
}