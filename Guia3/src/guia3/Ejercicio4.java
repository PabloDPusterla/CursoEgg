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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, suma, cont;
        cont = 0;
        suma = 0;
        
        do{
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
         if (num < 0){
            break; 
        }
        cont = cont +1;
        suma = suma + num;
       
        }
        while(cont < 5 );
        
        System.out.println("La suma de todos los numeros es:" + suma);
        
        
        
    }
    
}
