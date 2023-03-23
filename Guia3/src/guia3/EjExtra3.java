/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
* de una vocal. Caso contrario mostrar un mensaje. 
* Nota: investigar la función equals() de la clase String.
 */
public class EjExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        
        if (letra.length()>1) {
            System.out.println("Ingrese '1' letra");
            //letra = leer.nextLine();
        }
        else if(letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E") ||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")){
            System.out.println("La letra es una bocal");
        }
        else{
            System.out.println("La letra no es una bocal");
        }
    
        
    }
    
}
