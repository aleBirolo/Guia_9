/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.Jugador;
import Servicios.JuegoServicio;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JuegoServicio js = new JuegoServicio();
        ArrayList<Jugador> jugadores = js.crearJugadores();
        Jugador perdedor;
        js.mostrarJugadores(jugadores);
        
        perdedor = js.ronda(jugadores);
        
        System.out.println("Perdedo:" + perdedor);
    }
    
}
