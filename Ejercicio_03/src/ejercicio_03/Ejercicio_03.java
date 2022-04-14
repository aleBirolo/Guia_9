/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;


/**
 *
 * @author Alejandro Birolo
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Carta> a1 = new ArrayList<>();
        Baraja b1 = new Baraja ();
        Carta c1;
        
        System.out.println("\n Baraja creada: \n"+ b1);
        System.out.println("Cartas Disponibles: "+ b1.cartasDisponibles()); 
                
        System.out.println("\n Baraja mezclada: \n\n" + b1.mezclarBaraja());
      
        while ( (c1 = b1.siguienteCarta()) != null )
            System.out.println("Proxima carta: " + (c1=b1.siguienteCarta()));
        System.out.println("Baraja vacia");
        
        System.out.println("Cartas Disponibles: "+ b1.cartasDisponibles()); 
        
        System.out.println("Cartas del monton: ");
        b1.cartasDelMonton();
      
        if ( (a1= b1.darCartas(5)) != null)
            System.out.println("Cartas dadas: "+ a1.toString());
        else
            System.out.println("No hay suficientes cartas");
        
/*
        System.out.println("Proxima carta: " + (c1=b1.siguienteCarta()));
        System.out.println("Proxima carta: " + (c1=b1.siguienteCarta()));
        System.out.println("Cartas del monton: ");
        b1.cartasDelMonton();
*/
    }
    
}
