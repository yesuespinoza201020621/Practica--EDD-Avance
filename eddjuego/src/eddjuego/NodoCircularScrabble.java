/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddjuego;

/**
 * Clase principa que implementa los metodos de la clase ListaCircular.
 * @author Yesus
 */

public class NodoCircularScrabble {
    // miembros de acceso de paquete;
   // Lista puede accesar a este directamente
    Object datonombrejugador;       
   NodoCircularScrabble proximoNodoCircularScrabble;   
   
     // Constructor para crear a Nodo circular
   // que se refiere al objeto 
     NodoCircularScrabble( Object objeto ) 
   { 
      this( objeto, null ); 
   }
    // Constructor para crear a Nodo ciruclar
   // referencia al objeto
   // y apuntador para el siguiente nodo
     NodoCircularScrabble( Object objeto, NodoCircularScrabble nodocircular )
   {
      datonombrejugador = objeto;    
      proximoNodoCircularScrabble = nodocircular;  
   }
     // devuelve el Objeto en este nodo
   Object obtenerObjeto() 
   { 
      return datonombrejugador; 
   }

   // devuelve  el proximo nodo
   NodoCircularScrabble obtenerProximo() 
   { 
      return proximoNodoCircularScrabble; 
   }


}
 


