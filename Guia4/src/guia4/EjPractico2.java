/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
Diseñe una función que pida el nombre y la edad de N personas e imprima los
* datos de las personas ingresadas por teclado e indique si son mayores o 
* menores de edad. Después de cada persona, el programa debe preguntarle al 
* usuario si quiere seguir mostrando personas y frenar cuando el usuario 
* ingrese la palabra “No”.
 */
public class EjPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        String nombre, salir;
        
        
        do{
            System.out.println("Ingrese el nombre");
            nombre = leer.nextLine();
            
            
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            
            System.out.println(""+ menoromayor(nombre, edad));
            leer.nextLine();
            
            System.out.println("Desea continuar? (SI/NO)");
            salir = leer.nextLine();
            
            
            
        }while(!salir.equalsIgnoreCase("NO"));
        
        
    }
    
    public static String menoromayor(String nombre, int edad){
        
        String resultado;
        if(edad>=18){
            resultado = "Es mayor";
        }
        else
            resultado = "no es mayor";
        
        return resultado;
    }
    
}
