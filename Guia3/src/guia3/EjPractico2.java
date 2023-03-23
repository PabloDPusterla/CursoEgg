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
public class EjPractico2 {
    
    /*Crear un programa que pida una frase y si esa frase es igual
    a “eureka” el programa pondrá un mensaje de Correcto, 
    sino mostrará un mensaje de Incorrecto.
    Nota: investigar la función equals() en Java.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String clave;
        
        
        Scanner leer = new Scanner(System.in);
        
        
        do{
         System.out.println("Ingrese la palabra clave");
         clave = leer.nextLine();      
        }
       while(!clave.equals("eureka"));
        
       System.out.println("Clave correcta");
        
        
    }
    
}
