

package com.mycompany.ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner grad = new Scanner(System.in);
        
        
        System.out.println("Ingrese los Grados Centigrados");
        double c = grad.nextDouble();
        
        
        double f=32+(9*c/5);
        
        System.out.println("La Conversion a grados Fahrenhett es: "+f);
    }
}
