/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroServicio;
import Servicios.PersonaServicio;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio humanServ = new PersonaServicio();
        PerroServicio dogServ = new PerroServicio();
        Persona human1 = humanServ.crearPersona();
        Perro dog1 = dogServ.crearPerro();
//        Persona human2 = humanServ.crearPersona();
//        Perro dog2 = dogServ.crearPerro();
        
        if(dog1 == null)
            System.out.println("Error");
        else{
            System.out.println("\nPersona ingresada: "+ human1.toString());
            System.out.println("\nPerro ingresada: "+ dog1.toString());
        }
        
        humanServ.asignarMascota(human1, dog1);
        
        System.out.println("\nPersona con su perro: "+ human1.toString());
    }
    
}
