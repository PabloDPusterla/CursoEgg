/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
* cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class EjPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, una = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        System.out.println("Ingrese la cantidad de elementos del vector");
        n = leer.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print(vector[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (vector[i] < 10) {
                una++;
            }

            if (vector[i] < 100 && vector[i] > 9) {
                dos++;
            }

            if (vector[i] < 1000 && vector[i] > 99) {
                tres++;
            }

            if (vector[i] < 10000 && vector[i] > 999) {
                cuatro++;
            }

            if (vector[i] < 100000 && vector[i] > 9999) {
                cinco++;
            }
        }

        System.out.println("La cantidad de Nros de una cifra es " + una);
        System.out.println("La cantidad de Nros de dos cifras es " + dos);
        System.out.println("La cantidad de Nros de tres cifras es " + tres);
        System.out.println("La cantidad de Nros de cuatro cifras es " + cuatro);
        System.out.println("La cantidad de Nros de cinco cifras es " + cinco);
    }
}
