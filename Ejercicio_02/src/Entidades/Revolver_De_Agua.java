/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alejandro Birolo
 */
public class Revolver_De_Agua {
    private final static int TAM_TAMBOR= 6;
    private int tambor[][];

    public Revolver_De_Agua() {
        tambor= new int [TAM_TAMBOR][2];
    }
    
    public void llenarRevolver(){
        
        tambor= new int [TAM_TAMBOR][2];
        ArrayList numbers = new ArrayList(TAM_TAMBOR);
        
        for (int i=1 ; i<= TAM_TAMBOR ; i++)
            numbers.add(i);
        
        Collections.shuffle(numbers);
        
        for (int i=0; i< TAM_TAMBOR ; i++)
        {
            tambor[i][0]= (int)numbers.remove(0);
            tambor[i][1]= (int) (Math.random() * (2 - 0));
        }
    }
    
    public boolean mojar()
    {
        if (tambor[0][1]==1)
        {
            tambor[0][1]=0;
            siguienteChorro();
            return true;
        }
        
        siguienteChorro();   
        return false;
    }
    
    private void siguienteChorro()
    {
        int pos = tambor[0][0];
        int aux;
        int i;
        
        for ( i=1 ; i<TAM_TAMBOR; i++)
        {
            tambor[i-1][0]=tambor[i][0];
            tambor[i-1][1]=tambor[i][1];
        }
        
        tambor[i-1][0]=pos;
        tambor[i-1][1]=0;
    }
    
    public void mostrarRevolver()
    {
        for (int i=0; i< TAM_TAMBOR ; i++)
        {
            System.out.println("["+tambor[i][0]+"]["+tambor[i][1]+"]");
        }
    }

    @Override
    public String toString() {
        return "Revolver De Agua{ Posicion "+ tambor[0][0]+ " " + ((tambor[0][1] == 1) ? "Cargada " : "Descargada ")  + '}';
    }

}
