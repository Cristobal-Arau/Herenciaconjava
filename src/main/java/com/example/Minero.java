package com.example;

public class Minero extends Persona {
    String turno;

    public Minero(String nombre, String apellido, String sexo, int edad, String turno) {
        super(nombre, apellido, sexo, edad);
        this.turno = turno;
    }
    public void trabajar(){
        System.out.println("Hey "+nombre+" "+apellido+" Está minando en el turno de: "+turno);
    }
    
    
}
