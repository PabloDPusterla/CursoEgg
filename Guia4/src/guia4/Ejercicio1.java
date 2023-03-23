/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**

* 
* 
* 
* 
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        String frase2;
        
        
        do{
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        }
        while(!frase.endsWith("."));
        
        
        frase2 = conversor(frase);
        
        System.out.println(" "+ frase2);
        
    }
    
   public static String conversor(String frase){
        String f1,f2,f3,f4,f5;
        
        f1 = frase.replace("a", "@");
        f2 = f1.replace("e", "#");
        f3 = f2.replace("i", "$");
        f4 = f3.replace("o", "%");
        f5 = f4.replace("u", "*");

        return f5;
       
   }
    
    
    
}

