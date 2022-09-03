

package com.mycompany.ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int numdoble;
        int numtriple;
        
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int num1 = num.nextInt();
        
        numdoble = num1 *2;
        numtriple = num1 *3;
        
        System.out.println("El numero doble de "+num1+"Es: "+numdoble);
         System.out.println("El numero doble de "+num1+"Es: "+numtriple);
    }
}
