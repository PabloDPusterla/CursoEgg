/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones
 * necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
 * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los 
 * valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class EjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String A,B,C,D,E;
        
        A = "A";
        B = "B";
        C = "C";
        D = "D";
        E = "E";
        
        System.out.println("A:" + A );
        System.out.println("B:" + B );
        System.out.println("C:" + C );
        System.out.println("D:" + D );
        System.out.println("-------------");
        
        E = B;
        B = C;
        C = A;
        A = D;
        D = E;
        
        System.out.println("A:" + A );
        System.out.println("B:" + B );
        System.out.println("C:" + C );
        System.out.println("D:" + D );
        System.out.println("-------------");
        
       
    }
    
}
