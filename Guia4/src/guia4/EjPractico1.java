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
public class EjPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1 , num2, resultado, opcion;
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
       
        do {
            System.out.println("Elija un opcion");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    resultado=sumar(num1,num2);
                    System.out.println("El resultadoi de la suma es : "+resultado);
                case 2:
                    restar(num1,num2);
                    break;
                case 3:
                    multiplicar(num1,num2);
                    break;
                case 4:
                    dividir(num1,num2);
                    break;
             
                             }
                    
             
        }while (opcion != 5);
        
        }
        public static int sumar(int num1 , int num2){
            int resultado = num1+num2;
            return  resultado;
            
        }
        public static int restar(int num1 , int num2){
            int resultado = num1-num2;
            return resultado;
        }
        
        public static int multiplicar (int num1 , int num2){
        int resultado = num1*num2;
        return resultado;
        }
        
        public static int dividir (int num1 , int num2){
            int resultado = num1/num2;
            return resultado;
        }
    }
