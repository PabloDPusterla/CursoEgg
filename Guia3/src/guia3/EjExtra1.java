/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
* si el usuario ingresa 1600 minutos, el sistema debe calcular su 
* equivalente: 1 día, 2 horas
 */
public class EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         
        
        System.out.println("Ingrese los minutos");
        int min = leer.nextInt();
        
        int min2;
         min2 = (min%1440) /60;
                 
        if(min<1440){
        System.out.println("equivale a: "+ min / 1440 +"dias y "+ min/60 + "horas" );
        }
        else{
        System.out.println("equivale a: "+ min / 1440 +"dias y "+  min2 + "horas" );    
        }
        }
        
    }
    

