package com.uniajc;
public class Mascota {
    private String nombre;
    private String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido.");
    }
}


