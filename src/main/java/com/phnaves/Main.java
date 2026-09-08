package com.phnaves;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== pipeline-demo ===");
        System.out.println("2 + 3 = " + calc.somar(2, 3));
        System.out.println("10 / 4 = " + calc.dividir(10, 4));
    }
}