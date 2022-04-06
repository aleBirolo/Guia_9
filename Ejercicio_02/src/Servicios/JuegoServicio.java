/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class JuegoServicio {
    ArrayList<Jugador> jugadores;
    
    public ArrayList<Jugador> crearJugadores(){
        
        Scanner teclado= new Scanner(System.in);
        int nCant;
        
        System.out.print("\n Ingrese la cantidad de jugadores: ");
        nCant = teclado.nextInt();
        
        jugadores = new ArrayList<>(nCant);
        
        for (int i=0 ; i< nCant; i++)
            jugadores.add(new Jugador(i+1));
        
        return jugadores;
    }
    
    public Jugador ronda(ArrayList<Jugador> juga){
        Collections.shuffle(juga);
        Jugador tempo;
        int i=0;
        
        tempo = juga.get(i);
        if (tempo.disparo())
            tempo.setMojado(true);
        
        while (tempo.isMojado() == false)
        {
            i++;
            if (i == juga.size())
                i=0;
            
            tempo = juga.get(i);
            if (tempo.disparo())
                tempo.setMojado(true);
        }
        
       return tempo;
    }
    
    public void mostrarJugadores(ArrayList<Jugador> juga)
    {
        for (Jugador jugador : juga) {
            System.out.println(jugador);
        }
    }
}
