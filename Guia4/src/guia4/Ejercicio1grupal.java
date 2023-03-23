/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio1grupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
        } while (!frase.endsWith("."));
      
        String fraseN = funcion(frase);
        System.out.println(fraseN);

    }

    public static String funcion(String frase) {
        String resultado;
        resultado = "";
        int x = frase.length();
        for (int i = 0; i != x; i++) {
            String letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                    letra = "@";
                    resultado+=letra;
                    break;
                case "e":
                    letra = "#";
                    resultado+=letra;
                    break;
                case "i":
                    letra = "$";
                    resultado+=letra;
                    break;
                case "o":
                    letra = "%";
                    resultado+=letra;
                    break;
                case "u":
                    letra = "*";
                    resultado+=letra;
                    break;
                default:
                    resultado+=letra;
                    
            }
           
          
        }
       
          return resultado;
    }

}
