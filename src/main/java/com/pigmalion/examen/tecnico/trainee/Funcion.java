package com.pigmalion.examen.tecnico.trainee;

import java.util.HashSet;

public class Funcion {

    /**
     * Un algoritmo que resuelva el problema asumiendo que la máquina en donde va a
     * correrse el
     * programa tiene recursos infinitos, que el tiempo de ejecución no importa y
     * que lo más
     * importante es realizar el desarrollo en el menor tiempo posible.
     * Retorna "true" si al sumar 2 elementos coincide con el valor esperado
     * por parametro "resultado"
     * Retorna "false" si no hubo coindicendia con el resultado.
     * 
     * @author Fernando Valls
     * @param numeros   -> array de numeros que sumaremos.
     * 
     * @param resultado -> resultado que se espera obtener
     * @return boolean
     */

    public static boolean requiredSumAlgoritmoUno(int[] numeros, int resultado) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == resultado) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Un algoritmo que resuelva el problema asumiendo que los recursos son un
     * bien preciado, que el tiempo de ejecución si importa y que el tiempo de
     * desarrollo no es importante.
     * Retorna "true" si al sumar 2 elementos coincide con el valor esperado
     * por parametro "resultado"
     * Retorna "false" si no hubo coindicendia con el resultado.
     * 
     * 
     * @author Fernando Valls
     * @param numeros   -> array de numeros que sumaremos.
     * 
     * @param resultado -> resultado que se espera obtener
     * @return boolean
     */

    public static boolean requiredSumAlgoritmoDos(int[] numeros, int resultado) {
        HashSet<Integer> complementos = new HashSet<>();

        boolean encontre = false;
        int i = 0;
        while (i < numeros.length && !encontre) {
            int complemento = resultado - numeros[i];
            if (complementos.contains(complemento)) {
                encontre = true;
            } else {
                complementos.add(numeros[i]);
                i++;
            }

        }

        return encontre;
    }

}
