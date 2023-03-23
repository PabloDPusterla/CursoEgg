/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
* secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE, que no respete el formato se considera 
* incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
* correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
* investigar cómo se utilizan las siguientes funciones de Java Substring(),
* Length(), equals().
  
 */
public class EjPractico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int contCorrecto, contIncorrecto;
        contCorrecto = 0;
        contIncorrecto = 0;
        
        
        System.out.println("&&&&& : fin de ingresos");
        System.out.println("primer caracter X y ultimo 0 (secuencia FDE)");
        System.out.println("===================================================");
        
        // Usar un bucle while en lugar de do-while
        while(true){
            // Pedir la frase al inicio del bucle
            System.out.println("Ingrese la frase");
            cadena = leer.nextLine();
            
            // Salir del bucle si la frase es "&&&&&"
            if(cadena.equalsIgnoreCase("&&&&&")){
                break;
            }
            
            // Usar substring con dos parámetros y equals para comparar cadenas
            if(cadena.length()==5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("0")){
                contCorrecto ++;
                
            }
            else{
                contIncorrecto ++;
                
            }
            
        }

        System.out.println("cantidad de correctos:" + contCorrecto);
        System.out.println("cantidad de incorrectos:" + contIncorrecto);
        
    }
    
}
