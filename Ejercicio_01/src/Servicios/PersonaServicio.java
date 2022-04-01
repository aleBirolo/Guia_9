/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        String apellido;
        int edad;
        long documento;
        
        System.out.print("Ingrese nombre:");
        nombre = teclado.next();
        System.out.print("Ingrese apellido:");
        apellido = teclado.next();
        System.out.print("Ingrese edad:");
        edad = teclado.nextInt();
        System.out.print("Ingrese documento:");
        documento = teclado.nextLong();
        
        return new Persona(nombre, apellido, edad, documento);
    }
    
    public void asignarMascota(Persona h,Perro p){
        h.setPerro(p);
    }
}
