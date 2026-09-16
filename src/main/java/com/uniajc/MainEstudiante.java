package com.uniajc;

public class MainEstudiante {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");

        Estudiante estudiante1 = new Estudiante("William", 21, "1109185394", "Ingeniería de Software", 4.5);

        System.out.println("Imprimiendo información del estudiante 1: ");
        estudiante1.mostrarInformacion();
        System.out.println(estudiante1.estudiar());

        System.out.println("-----------------------------------");

        Estudiante estudiante2 = new Estudiante("Maria", 20, "3364852415", "Ingeniería de Software", 3.5);

        System.out.println("Imprimiendo información del estudiante 2: ");
        estudiante2.mostrarInformacion();
        System.out.println(estudiante2.estudiar());

        System.out.println("-----------------------------------");

        Estudiante estudiante3 = new Estudiante("Pablo", 29, "1103183295", "Ingeniería de Software", 4.2);

        System.out.println("Imprimiendo información del estudiante 3: ");
        estudiante3.mostrarInformacion();
        System.out.println(estudiante3.estudiar());
    }
}