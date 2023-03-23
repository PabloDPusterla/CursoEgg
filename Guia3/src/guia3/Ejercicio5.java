/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, cont;
        cont = 0;
        
        do {
            System.out.println("Ingrese un numero entre 1 y 20:");
            num = leer.nextInt();
            cont = cont +1;
            
            for (int i = 0; i < num; i++) {
                System.out.print("*");
                
            }
            System.out.println("");
        } while (cont < 4);
        
            
        
        
    }
    
}
