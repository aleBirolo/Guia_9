/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.Palos;

/**
 *
 * @author Alejandro Birolo
 */
public class Carta {
    private int numero;
    private Palos palo;

    public Carta(int numero, Palos palo) {
        
        setNumero(numero);
        this.palo = palo;
    }

    public void setNumero(int numero) {
        if (numero < 1 || numero > 12 || numero == 8 || numero ==9 )
            this.numero = 1;
        else
            this.numero = numero;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palos getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return numero + " de " + palo + "\n" ;
    }
    
}
