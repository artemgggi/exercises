package ru.artemgggi.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (first == second && second > third) {
            result = first;
        }
        return result;
    }
}
