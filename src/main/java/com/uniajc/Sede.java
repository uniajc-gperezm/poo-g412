package com.uniajc;

public class Sede{

    private String nombre;
    private String direccion;
    private String ciudad;

    public Sede(){
    }

    public Sede(String name){
        this.nombre = name;
    }

    public Sede(String name, String direccion, String ciudad){
        this.nombre = name;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre de la sede: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Ciudad: " + this.ciudad);
    }
    
}