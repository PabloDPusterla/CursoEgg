/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 */
public class EjExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double mayor = Double.MIN_VALUE, menor = Double.MIN_VALUE;
        int n, contingresos = 0, total = 0, numero = 0;

        System.out.println("Ingrese la cantidad de numeros:");
        n = leer.nextInt();

        while (contingresos < n) {

            contingresos++;

            System.out.println("Ingresar un numero");
            numero = leer.nextInt();

            total += numero;

            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);

        }

        System.out.println("mayor: " + Math.round(mayor));
        System.out.println("menor: " + Math.round(menor));
        System.out.println("promedio: " + contingresos / n);

    }

}
