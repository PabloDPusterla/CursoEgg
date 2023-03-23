/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
* se muestre su equivalente en romano.
 */
public class EjExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero del 1 al 10");
        num = leer.nextInt();
        
        //sin es menor de 5 solo poner palitos con el limite del numero ingresado
        if (num<5) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
            System.out.println(" ");
            
        } // si es un 5 poner el V
        else if(num == 5){
            System.out.println("V");
            
        }
        // si es mayor de 5 poner la v seguido de lso palitos con el limite de el numero ingresado
        else if(num > 5 && num < 10){
            System.out.print("V");
            for (int i = 0; i < num -5; i++) {
                System.out.print("I");
                
            }
            System.out.println(" ");
            
        }
        else{
            if(num ==10){
            System.out.println("X");
            }
        }
        
        
    }
    
}
