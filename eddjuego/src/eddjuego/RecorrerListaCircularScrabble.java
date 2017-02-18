/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddjuego;

/**
 *
 * @author Yesus
 */

public class RecorrerListaCircularScrabble {
    private NodoCircularScrabble NodoCabezaCircularScrabble;
    private NodoCircularScrabble  NodoPrimeroScrabble ;
       //private String nombrejugador;
    
    /*public RecorrerListaCircularScrabble(String CademaNombreJugador){
        nombrejugador=CademaNombreJugador;
        NodoCabezaCircularScrabble=null;
        
    }*/
    //constructor
       public RecorrerListaCircularScrabble() 
   { 
    
   }  
    
    // retorna true si la Lista esta vacía
   public synchronized boolean estaVacio()
   { 
      return NodoCabezaCircularScrabble == null; 
   }
    
    public synchronized void insertar( Object elementoAInsertarJugador )
   {
      if ( estaVacio() ) {
         NodoCabezaCircularScrabble = new NodoCircularScrabble( elementoAInsertarJugador);
         NodoCabezaCircularScrabble.proximoNodoCircularScrabble=NodoCabezaCircularScrabble;
         
      }
      else {
      	 NodoCircularScrabble ultimoNodoCircularScrabble;
      	 NodoCircularScrabble actualCircularScrabble = NodoCabezaCircularScrabble;
      	 while(actualCircularScrabble.proximoNodoCircularScrabble != NodoCabezaCircularScrabble) {
      	 	actualCircularScrabble = actualCircularScrabble.proximoNodoCircularScrabble;
      	 }
      	 ultimoNodoCircularScrabble = actualCircularScrabble;
         
            NodoCircularScrabble DesplazadoCircularScrabble = NodoCabezaCircularScrabble;
         NodoPrimeroScrabble = new NodoCircularScrabble( elementoAInsertarJugador, DesplazadoCircularScrabble );
      	 ultimoNodoCircularScrabble.proximoNodoCircularScrabble=  NodoPrimeroScrabble;
 
      }
   }

    
       public String imprimir()
   {
       StringBuilder b=new StringBuilder();
      if ( estaVacio() ) {
         System.out.println( "Vacio "  );
         
      }
      //System.out.print( "La lista " + nombre + " es: " );
      NodoCircularScrabble actual = NodoCabezaCircularScrabble;              
      // mientras no es el final de la lista, se muestra
      // el dato del nodo actual
      do {
         b.append(actual.datonombrejugador.toString() + " ->" );         
         actual = actual.proximoNodoCircularScrabble;         
      } while (  NodoCabezaCircularScrabble != actual );
      b.append(actual.datonombrejugador.toString());
             return b.toString();
   }
      
   }


            
    
