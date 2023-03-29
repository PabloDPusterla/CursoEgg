/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente. Por ejemplo: 
 * 50 / 13: 
 * 50 – 13 = 37 una resta realizada 
 * 37 – 13 = 24 dos restas realizadas
 * 24 – 13 = 11 tres restas realizadas dado que 11 es menor que 13,
 * entonces: el residuo es 11 y el cociente es 3.
 *
 */
public class EjExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        int resto = num1;

        while (resto >= num2) {
            resto -= num2;
            cont++;
        }
        
        System.out.println("El residuo es: "+resto +" el cociente es: "+ cont);

    }

}
