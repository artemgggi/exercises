package ru.artemgggi.calculator;
//import ru.artemgggi.math.*;
import static ru.artemgggi.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static  double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + allOperations(10, 20));
    }
}
