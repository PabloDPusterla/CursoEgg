/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 
 * 0-0-0 
 * 0-0-1 
 * 0-0-2 
 * 0-0-E 
 * 0-0-4 
 * 0-1-2
 * 0-1-E
 * Nota: investigar función equals() y como convertir números a String.
 * 
 * 
 * for (int i = 0; i < 1000; i++) {
            String s = String.format("%03d", i);
            s = s.replace("3", "E");
            System.out.println(s);
        }
 *
 */
public class EjExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       String cadena1,cadena2,cadena3;
        
        for (int i = 0; i < 10; i++) {     
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {                   
                    cadena1 = String.valueOf(i);
                    cadena2 = String.valueOf(j);
                    cadena3 = String.valueOf(k);
                    
                     if (cadena1.equals("3")) {
                        cadena1 = cadena1.replace("3", "E");
                    }
                     if (cadena2.equals("3")) {
                        cadena2 = cadena2.replace("3", "E");
                    }
                     if (cadena3.equals("3")) {
                        cadena3 = cadena3.replace("3", "E");
                    }
                    
                    System.out.println("["+cadena1+"]"+"["+cadena2+"]"+"["+cadena3+"]");
                }
            }
            
        }
    }

}
