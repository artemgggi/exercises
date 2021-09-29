package ru.artemgggi.loop;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

	@Test
	public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
		int n = 5;
		int expect = 120;
		int result = Factorial.calc(n);
		Assert.assertEquals(expect, result);
	}

	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		int n = 0;
		int expect = 1;
		int result = Factorial.calc(n);
		Assert.assertEquals(expect, result);
	}
}