/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 Escribir un programa que lea un número entero y devuelva el número de dígitos 
 * que componen ese número. Por ejemplo, si introducimos el número 12345, 
 * el programa deberá devolver 5. Calcular la cantidad de dígitos 
 * matemáticamente utilizando el operador de división. Nota: recordar que las
 * variables de tipo entero truncan los números o resultados.
 */
public class EjExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
         int cantdigitos = 0;
         
         while(num != 0){
             num/= 10;
             cantdigitos++;
             
         }
        System.out.println("Cantidad de digitos: "+  cantdigitos);
    }
    
}
