package ru.artemgggi.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        int result = left > right ? left : right;
        //int result = Math.max(left, right);
        return result;
    }
}

