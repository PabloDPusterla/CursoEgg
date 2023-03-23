/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor limite positivo, y a 
 * continuacion solicite numeros al usuario hasta que la suma de los numeros
 * introducidos supere el limite inicial.
 */
public class EjPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       int limite = 10;
       int num, suma;
       suma = 0;
       
       do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
       }
        while(suma <= limite);
        System.out.println("Limite alcanzado");   
        
    }
    
}
