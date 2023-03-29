/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
public class EjExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double estatura, promedio = 0, promediobajo160 = 0, sumaestatura = 0;
        int cont = 0;

        while (true) {
            
            System.out.println("Ingrese la altura de la persona. para terminar: 0");
            estatura = leer.nextDouble();
            
            if (estatura == 0) {
                break;
            }
            
            sumaestatura += estatura;
            cont++;

            if (estatura < 160) {
                promediobajo160 += estatura;

            }
        }

        if (cont > 0){
            promedio = sumaestatura / cont;
        }
        if (promediobajo160 > 0) {
            promediobajo160 /= cont;
        }

        System.out.println("el promedio general es: " + promedio + " el promedio debajo de 1.6mt es:" + promediobajo160);
    }

}
