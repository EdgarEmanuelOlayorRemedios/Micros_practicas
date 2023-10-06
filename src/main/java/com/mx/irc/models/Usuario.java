package com.mx.irc.models;

import java.util.List;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private int edad;
    private Direccion direccion;
    private List<String> hobbies;

    // getters y setters...

    public Usuario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}







