package ru.artemgggi.calculator;

public class Calculator {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static double rubleToDollar(float value) {
        return value / 65;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float outEuro = Calculator.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;

        double expectedDollar = 2.15;
        double outDollar = Calculator.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;

        System.out.println("140 rubles is Test result : " + passedEuro);
        System.out.println("140 rubles is Test result : " + passedDollar);
    }
}
