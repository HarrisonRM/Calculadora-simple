package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner calcubasic = new Scanner(System.in);
        double numero1, numero2;
        double resultado = 0;
        char operacion;
        System.out.println("Ingresa el primer numero");
        numero1 = calcubasic.nextDouble();
        System.out.println("Ingresa el segundo numero");
        numero2 = calcubasic.nextDouble();
        System.out.println("¿Que operacion quieres hacer?");
        operacion = calcubasic.next().charAt(0);

        // Paso 4
        if (operacion == '+') {
            resultado = numero1 +
                    numero2;
        } else if (operacion == '-') {
            resultado = numero1 - numero2;
        } else if (operacion == '*') {
            resultado = numero1 * numero2;
        } else if (operacion == '/') {
            if (numero2 != 0)
                resultado = numero1 / numero2;

        }
        System.out.println(" el resultado es: " + resultado);
        
        if (operacion == '%') {
            if (numero2 != 0) {
                resultado = numero1 % numero2;
            }
             }
             if (numero1 > numero2) { System.out.println( numero1+" numero 1 es mayor que : "+ numero2);
                
             } else if (numero1 < numero2 ) { System.out.println( numero1 +" numero 1 es menor que: " + numero2);
                
             } else System.out.println( numero1 + " son iguales "+ numero2); { 

                if ((int) resultado % 2 == 0) { System.out.println(" el resultado es par");
                
                    
                } else { System.out.println( "el resultado es impar");}

                
             }

    }
}