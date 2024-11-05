package com.mycompany.ejercicio3ip;
//Copyright:Ruth Bautista(202320050047).
//Este programa evalúa y muestra el resultado de tres expresiones booleanas
//Utilizando operadores de comparación y lógicos.
// Se definen tres variables enteras y se comprueba:
//1. Si M es mayor que T.
//2. Si la división de T entre K es igual a -5.
//3. Si la suma de  y T es igual a 7o si la resta de M y T es igual a 5.

public class Ejercicio3IP {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean resultado1 = M > T;
        boolean resultado2 = T / K == -5;
        boolean resultado3 = (M + T == 7) || (M - T == 5);
        
        System.out.println("M > T: " + resultado1); 
        System.out.println("T / K == -5: " + resultado2); 
        System.out.println("(M + T == 7) || (M - T == 5): " + resultado3); 
    }
}
 

