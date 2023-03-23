/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String numero1;
         String numero2;
         
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer Valor:");
            numero1 = leer.next();
       
        System.out.println("ingrese el segundo Valor:");
            numero2 = leer.next();
            
        System.out.println("El primer valor es:" + numero1);
        System.out.println("El primer valor es:" + numero2);
        
        
// Ejercicio 2

        String Nombre;
        
        System.out.println("Ingrese su nombre: ");
        Nombre = leer.next();
        System.out.println("Su nombre es: " + Nombre);
        
        
// Ejercicio 3
 

        String Frase;
        
        System.out.println("Ingrese una frase: ");
        Frase = leer.next();
        
        System.out.println("En mayusculas: " + Frase.toUpperCase());
        
        System.out.println("En minusculas: " + Frase.toLowerCase());
        
        
// Ejercicio 4

        int temperatura;
        int fahrenheit;
        System.out.println("Ingrese los grados Centigrados:");
        temperatura = leer.nextInt();
        fahrenheit = 32+(9*temperatura /5);
        System.out.println("En Fahrenheit es: "+ fahrenheit);
        
        
// Ejercicio 5
        
        double numero, raiz;
        
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        raiz = Math.sqrt(numero);
        
        System.out.println("El doble es: " + numero *2);
        System.out.println("El triple es: "+ numero *3);
        System.out.println("La raiz cuadrada es: "+ numero * numero);
        System.out.println("La raiz cuadrada es: "+ raiz);
        
        
    }
    
}



