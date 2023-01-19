package com.example;

public class Persona {
    String nombre;
    String apellido;
    String sexo;
    int edad;

    public Persona(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
    public void respirar(){
        System.out.println("Hey "+nombre+" "+apellido +" Está respirando");
    }
    
    
}

