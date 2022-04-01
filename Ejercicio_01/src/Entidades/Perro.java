/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.RazaDePerros;

/**
 *
 * @author Alejandro Birolo
 */
public class Perro {
    private String nombre;
    private RazaDePerros raza;
    private int edad;
    private double tamanio;

    public Perro(String nombre, RazaDePerros raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public RazaDePerros getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(RazaDePerros raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
}
