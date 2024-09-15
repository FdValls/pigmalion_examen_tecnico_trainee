import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.pigmalion.examen.tecnico.trainee.Funcion;

public class TestAlgoritmoUno {

    /*
     * Resultado esperado "false" ya que no hay valores que sumados
     * den el valor de resultado
     */
    @Test
    public void EjemploUno() {
        int[] numeros = { 1, 2, 3, 4 };
        int resultado = 8;
        boolean resultadoSuma = Funcion.requiredSumAlgoritmoUno(numeros, resultado);
        assertEquals(false, resultadoSuma);
    }

    /*
     * Resultado esperado "true" ya que hay valores que sumados
     * den el valor de resultado
     */
    @Test
    public void EjemploDos() {
        int[] numeros = { 1, 2, 4, 4 };
        int resultado = 8;
        boolean resultadoSuma = Funcion.requiredSumAlgoritmoUno(numeros, resultado);
        assertEquals(true, resultadoSuma);
    }

}
