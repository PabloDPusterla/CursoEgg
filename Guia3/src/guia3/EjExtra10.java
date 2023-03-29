/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 Realice un programa para que el usuario adivine el resultado de una 
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta.
 * En caso que la respuesta sea incorrecta se debe permitir al usuario
 * ingresar su respuesta nuevamente. Para realizar este ejercicio investigue
 * como utilizar la función Math.random() de Java.
 */
public class EjExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, multi;
        
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        
        System.out.println("Ingrese el resultado de la multiplicacion de "+ num1 + " x " +num2);
        multi = leer.nextInt();
        
        while(num1*num2 != multi) {
            System.out.println("Error, vuelva a intentar");
            System.out.println("Ingrese el resultado de la multiplicacion de "+ num1 + " x " +num2);
            multi = leer.nextInt();
        }
    }
    
}
