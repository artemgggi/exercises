package ru.artemgggi.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		int start = 1;
		int finish = 10;
		int result = Counter.sumByEven(start, finish);
		int expected = 30;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenSumEvenNumbersFrom4To8ThenEigten() {
		int start = 4;
		int finish = 8;
		int result = Counter.sumByEven(start, finish);
		int expected = 18;
		Assert.assertEquals(expected, result);
	}
}