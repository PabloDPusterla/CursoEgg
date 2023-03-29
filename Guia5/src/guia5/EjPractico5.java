/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
 * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
 * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
public class EjPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int matriz[][] = new int[3][3];
        
        llenar(matriz);
        mostrar(matriz);
        System.out.println("=============================");
        mostrartranspuesta(matriz);
        
    }
    
    public static void llenar(int matriz[][]){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor:");
                //int num = leer.nextInt();
                matriz[i][j] = leer.nextInt();
            }
        }
        
    }
    
    public static void mostrar(int matriz[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j]+ "]");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void mostrartranspuesta(int matriz[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i]+ "]");
            }
            System.out.println(" ");
        }
        
    }
    
    
    
}
