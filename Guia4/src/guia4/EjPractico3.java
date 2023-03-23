/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros 
 * y la moneda a convertir que será una cadena, este no devolverá ningún 
 * valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
public class EjPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese a que moneda lo quiere convertir:");
        String moneda = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de euros:");
        double euros = leer.nextInt();
        
        

        conversor(euros, moneda);
    }
    
    public static void conversor(double euros, String moneda){
        
        double resultado;
        
        if (moneda.equalsIgnoreCase("libras")) {
            
            resultado =  euros * 0.86;
            System.out.println("en libras es: " + resultado);
        }
        else if(moneda.equalsIgnoreCase("yen")){
            resultado =  euros * 0.86;
            System.out.println("en libras es: " + resultado);
        }
        else if(moneda.equalsIgnoreCase("dolar")){
            resultado =  euros * 129.856;
            System.out.println("en dolares es: " + resultado);
        }
        else{
            System.out.println("Ingrese una moneda valido!");
        }
            
        
    }

   
    
}
