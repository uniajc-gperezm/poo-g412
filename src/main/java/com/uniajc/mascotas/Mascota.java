package com.uniajc.mascotas;

public class Mascota {
    private String nombre;
    private String raza;
    private String especie;
    private int edad;

    public Mascota(String nombre, String raza, String especie, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String hacerSonido() {
        return this.nombre + " (especie: " + this.especie + ") está haciendo un sonido.";
    }

    public String comer() {
        return this.nombre + " está comiendo.";
    }
}
