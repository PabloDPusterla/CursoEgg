/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author pablo
 */

public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresar pablonombre");
        nombre = leer.next();
        System.out.println("Hola soy: " + nombre);
        
       
        // TODO code application logic here
    }
    
}
