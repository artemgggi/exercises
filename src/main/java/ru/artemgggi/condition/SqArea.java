package ru.artemgggi.condition;

public class SqArea {
    public static double square(double p, double k) {
        return ((p / (2 * (k + 1))) * k) * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result2);

    }
}
