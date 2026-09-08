package com.phnaves;

/**
 * Classe simples com logica de verdade, para o CI ter o que testar.
 */
public class Calculator {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao permitida");
        }
        return (double) a / b;
    }
}
