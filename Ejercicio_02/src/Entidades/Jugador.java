/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alejandro Birolo
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;
    private Revolver_De_Agua revol;
    
    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador "+id;
        this.mojado = false;
        this.revol= new Revolver_De_Agua();
        this.revol.llenarRevolver();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo()
    {
        return revol.mojar();
    }
    
    @Override
    public String toString() {
        return "Jugador " + id + ", Estado = " + ((mojado == false ) ? "Seco": "Mojado") +", "+ revol ;
    } 
}
