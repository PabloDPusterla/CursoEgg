/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String equipo[] = new String[5];
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un nombre: ");
            equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("["+ equipo[i] + "]");
        }
        System.out.println();
    }
    
}
