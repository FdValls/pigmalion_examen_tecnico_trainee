package com.pigmalion.examen.tecnico.trainee;

import java.util.*;

public class Main {
    private static final String ALGORITMO_UNO = "Usando el algoritmo 1: ¿Puede el número %d formarse usando la suma de 2 elementos de un array? = %s \n";
    private static final String ALGORITMO_DOS = "Usando el algoritmo 2: ¿Puede el número %d formarse usando la suma de 2 elementos de un array? = %s \n";
    private static final int RESULTADO = 8;

    public static void main(String[] args) throws Exception {
        /*
         * Ejemplo 1
         * Input: nums = [1,4,3,9], requiredSum = 8
         * Output: False
         */
        int[] numerosEjemplo1 = { 1, 4, 3, 9 };

        System.out.printf("Ejemplo 1 \"Input: nums = %s, requiredSum = 8\",con ambos algoritmos: \n",
                Arrays.toString(numerosEjemplo1));
        System.out.printf(ALGORITMO_UNO, RESULTADO,
                Funcion.requiredSumAlgoritmoUno(numerosEjemplo1, RESULTADO));
        System.out.printf(ALGORITMO_DOS, RESULTADO,
                Funcion.requiredSumAlgoritmoDos(numerosEjemplo1, RESULTADO));

        System.out.println("*****************************");

        /*
         * Ejemplo 2
         * Input: nums = [1,2,4,4], requiredSum = 8
         * Output: True
         */

        int[] numerosEjemplo2 = { 1, 2, 4, 4 };
        System.out.printf("Ejemplo 2 \"Input: nums = %s, requiredSum = 8\", con ambos algoritmos: \n",
                Arrays.toString(numerosEjemplo2));
        System.out.printf(ALGORITMO_UNO, RESULTADO, Funcion.requiredSumAlgoritmoUno(numerosEjemplo2, RESULTADO));
        System.out.printf(ALGORITMO_DOS, RESULTADO, Funcion.requiredSumAlgoritmoDos(numerosEjemplo2, RESULTADO));
    }
}