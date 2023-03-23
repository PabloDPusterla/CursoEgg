/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
* usuario, validando que el primer número múltiplo del segundo e imprima si
* el primer número es múltiplo del segundo, sino informe que no lo son.

 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
        
    }
    
    public static void esMultiplo(int num1, int num2){
        
        if(num2%num1 == 0){
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }
        
        
    }
    
}
