package com.phnaves;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("soma de dois positivos")
    void deveSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    @DisplayName("subtracao com resultado negativo")
    void deveSubtrair() {
        assertEquals(-1, calc.subtrair(2, 3));
    }

    @ParameterizedTest
    @DisplayName("multiplicacao com varios pares")
    @CsvSource({
            "2,  3,  6",
            "0,  5,  0",
            "-4, 3, -12"
    })
    void deveMultiplicar(int a, int b, int esperado) {
        assertEquals(esperado, calc.multiplicar(a, b));
    }

    @Test
    @DisplayName("divisao retorna valor fracionario")
    void deveDividir() {
        assertEquals(2.5, calc.dividir(10, 4));
    }

    @Test
    @DisplayName("divisao por zero lanca excecao")
    void deveRejeitarDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}
