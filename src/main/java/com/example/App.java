package com.example;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona p =new Persona("Sebastian","Paredes","Hombre",23);
        p.respirar();
        Obrero a= new Obrero("Gabriela","Alveal","Mujer",34,"Martillo","Obrero");
        a.respirar();
        a.trabajar();
        Minero b=new Minero("Danilo","Hormazabal","Hombre",43,"Día");
        b.respirar();
        b.trabajar();
    }
}
