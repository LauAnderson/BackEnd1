package com.company.models;

public class User {
    private int id; //Atributo
    private UserType tipo;// Atributo anexado con la clase Enum


    public User(int id, UserType tipo) { //Constructor
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    } //Métodos accesores.

    public UserType getTipo() {
        return tipo;
    }

    public void setTipo(UserType tipo) {
        this.tipo = tipo;
    }
}
