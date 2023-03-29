/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 */
public class EjPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int vector[] = new int[n];

        llenar(vector);
        mostrar(vector);
        System.out.println("Ingrese un numero:");
        int selec = leer.nextInt();
        buscar(vector, selec);

    }

    
    
    public static void llenar(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrar(int vector[]) {

        System.out.println("los numeros son:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
    }

    public static void buscar(int vector[], int selec) {
        int cont = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            
            
            if (vector[i] == selec) {
                System.out.print("El numero: esta en la posicion: " + i);
                System.out.println(" ");
                cont++;
            }
                  
        }
           if (cont > 0) {
                System.out.println("el numero esta repetido: " +cont+ " veces");
                
            }
            if (cont == 0) {
                System.out.println("no ta");
                
            }
        System.out.println(" ");
    }

}
