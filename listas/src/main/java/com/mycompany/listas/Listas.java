
package com.mycompany.listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
       String[] names = new String[5]; //Array tradicional 
       ArrayList<String> list = new ArrayList<>(); //Array orientado a objetos casting <> array ajustable
       
       list.add( "Hola");
       list.add("Mundo");
       list.add("cruel");
       
       list.set(1, "gente"); //set: metodo para reemplazar valores de la lista. Primero la posicion y luego el elmento 
       
       list.remove(2);
               
        System.out.println( "Tamaño de la lista " + list.size()); //Size para calcular el tamaño del array
        System.out.println("¿Está Vacía? " + list.isEmpty()); //isEmpty: metodo para identificar si el array esta vacio 
        System.out.println("Valores de la lista: " + list );
        
   
    }
}
