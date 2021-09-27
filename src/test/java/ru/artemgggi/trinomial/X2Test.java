package ru.artemgggi.trinomial;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}