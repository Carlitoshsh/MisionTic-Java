package semana3.sesion3.JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class PruebaCalculadora {

    @Test
    public void pruebaSuma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(2, 3);
        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void pruebaDivisionPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.division(2, 0);
    }

    @Test
    public void pruebaDivision(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.division(4, 2);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado, resultado);
    }


}