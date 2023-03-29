/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EjExtra6otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);             
             DecimalFormat df = new DecimalFormat("#.00");
             
             String op;
             boolean loop=true;
             int i=0, petiso=0;
             double media=0;
            // clear();
             
             do {
                 i++;
                 System.out.print("Ingrese altura del sujeto "+i+": ");
                 double alt = leer.nextDouble();
                 
                 media+=alt;
                 if (alt<160) petiso++;
                 
                 do{
                     System.out.print("Desea continuar? (S/N)");
                     op = leer.next();
                     if ((op.equalsIgnoreCase("n"))||(op.equalsIgnoreCase("s"))) break;
                 }while (loop==true);
                 if (op.equalsIgnoreCase("n")) break;
             } while (loop==true);
             
             System.out.println("");
             System.out.println("De "+i+" sujetos...");
             System.out.println("Posen una altura media de "+df.format((media/i)));
             System.out.println("Y la media de personas por debajo de 1,60: "+petiso);
            // pausa();
    }
    
}
