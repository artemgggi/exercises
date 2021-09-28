package ru.artemgggi.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class BotTest {
    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = Bot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = Bot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = Bot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}