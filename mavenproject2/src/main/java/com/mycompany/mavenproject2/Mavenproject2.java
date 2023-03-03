

package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.lang.Math;
public class Mavenproject2 {

    public static void main(String[] args) {
        double radio;
        double areacirculo;
        double longcircunferencia;
        Scanner leerportateclado = new Scanner(System.in);
        
        
        System.out.println("Ingrese valor radio");
        radio = leerportateclado.nextDouble();
        
        areacirculo = Math.PI * Math.pow(radio,2);
        longcircunferencia = 2 * Math.PI *radio;
        
        System.out.println("El area del círculo es: " + areacirculo);
        System.out.println("La longitud de la circunferencia es: " + longcircunferencia);
        
    }
}
