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
public class EjExtra8 {

    /*Escriba un programa que lea números enteros. Si el número es múltiplo 
    de cinco debe detener la lectura y mostrar la cantidad de números leídos,
    la cantidad de números pares y la cantidad de números impares. Al igual 
    que en el ejercicio anterior los números negativos no deben sumarse. 
    Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean i = true;
       int par = 0, impar = 0;
        
        while(i = true){
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            
            if (num%5==0) {
                break;
            }
            else if(num%2== 0 && num > 0) {
                par++;
            }
            else if(num > 0){
                impar++;
            }
        }
        
        System.out.println("Cantidad de pares: "+ par);
        System.out.println("cantidad de impares: "+ impar);
    }
    
}
