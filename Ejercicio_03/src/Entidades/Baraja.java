/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alejandro Birolo
 */
public class Baraja {
    private final static int tamBaraja = 40;
    private ArrayList<Palos> tPalos;
    ArrayList<Carta> cartas;
    ArrayList<Carta> cartasMonton;
   
    public Baraja() {
        
        cartas = new ArrayList<>();
        cartasMonton = new ArrayList<>();
        crearBaraja();
    }
    
    private void crearBaraja(){
        
        tPalos= new ArrayList<>();
        tPalos.add(Palos.Copa);
        tPalos.add(Palos.Espada);
        tPalos.add(Palos.Basto);
        tPalos.add(Palos.Oro);
        
        for (int i=0 ; i<4 ; i++)
            for (int j=1 ; j<= tamBaraja/4; j++)
                cartas.add(new Carta((j>7) ? j+2: j, tPalos.get(i)) );
    }
    
    public Baraja mezclarBaraja()
    {
        Collections.shuffle(cartas);
        return this;
    }
    
    public Carta siguienteCarta()
    {
        Carta cEliminada ;
        
        if (cartas.size() > 0)
        {
            cEliminada= cartas.remove(0);
            cartasMonton.add(cEliminada);
            return cEliminada;
        }
        else
            return null;
    }
    
    public void cartasDelMonton()
    {
        System.out.println(cartasMonton);
    }
    
    public int cartasDisponibles()
    {
        return cartas.size();
    }
    
    /// No inserta estas cartas en las cartas del monton
    public ArrayList<Carta> darCartas(int cant)
    {
        ArrayList<Carta> cartasDadas= new ArrayList<>();
        
        if (cant > cartas.size())
            return null;
        
        for (int i=0 ; i<cant ; i++)
            cartasDadas.add(cartas.remove(0));
        
        return cartasDadas;
    }
    
    @Override
    public String toString() {
        return "{" + cartas + '}';
    }
    
    
}
