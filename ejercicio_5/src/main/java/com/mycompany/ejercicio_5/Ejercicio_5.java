
package com.mycompany.ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner rad = new Scanner(System.in);
        
        System.out.println("Ingrese el Radio del Cono");
        int radio = rad.nextInt();
        System.out.println("Ingrese la Altura del Cono");
        int altura = rad.nextInt();
        
        
        final float Pi = 3.1416f;
        float formula = (Pi*(radio*radio)*altura)/3;
        
        
        System.out.println("El Volumen del Cono es: "+formula);
    }
}
