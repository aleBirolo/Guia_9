/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Enumeraciones.RazaDePerros;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class PerroServicio {
    public Perro crearPerro(){
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        String razaIngresada;
        boolean razaFlag;
        RazaDePerros raza;
        int edad;
        double tamanio;
        razaFlag = false;
        
        System.out.print("Ingrese nombre:");
        nombre = teclado.next();
        System.out.print("Ingrese raza:");
        razaIngresada = teclado.next();
        
        
        for (RazaDePerros aux: RazaDePerros.values()){
            if (razaIngresada.equals(aux.toString())){
                razaFlag = true;
            }
        }
        
        if (!razaFlag)
            return null;
        
        raza = RazaDePerros.valueOf(razaIngresada);
        System.out.print("Ingrese edad:");
        edad = teclado.nextInt();
        System.out.print("Ingrese tamaño:");
        tamanio = teclado.nextDouble();
        
        return new Perro(nombre, raza, edad, tamanio);
    }
    
    
}
