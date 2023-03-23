/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
* todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
* los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
* dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
* un valor real que represente el costo del tratamiento (previo al descuento)
* y determine el importe en efectivo a pagar por dicho socio.

 */
public class EjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String tipo;
        int costo;
        costo = 1000;
        //float porcentaje;
        
        System.out.println("ingrese su tipo de socio (A,B,C):");
        tipo = leer.nextLine();
        
        switch(tipo){
            case "A":
                System.out.println("Costo sin descuento: $"+costo);
                System.out.println("Costo con descuento: $"+costo /2);
                break;
                
            case "B":
                System.out.println("Costo sin descuento: $"+costo);
                //porcentaje = (costo*0,35);
                System.out.println("Costo con descuento: $");
                break;
                
            case "C":
                System.out.println("Costo sin descuento: $"+costo);
                System.out.println("Costo con descuento: $"+costo /2);
                break;
                
        }
        
    }
    
}
