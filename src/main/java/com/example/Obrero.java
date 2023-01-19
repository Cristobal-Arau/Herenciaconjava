package com.example;

public class Obrero extends Persona {
    String herramientas;
    String puesto;

    public Obrero(String nombre, String apellido, String sexo, int edad, String herramientas, String puesto) {
        super(nombre, apellido, sexo, edad);
        this.herramientas = herramientas;
        this.puesto = puesto;
    }
    
    public void trabajar(){
        System.out.println("Hey "+nombre+" "+apellido+" Está trabajando en la construcción con la siguiente herramienta: "+herramientas);
    }
}
