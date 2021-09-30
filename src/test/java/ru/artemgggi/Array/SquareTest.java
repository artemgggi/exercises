package ru.artemgggi.Array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

	@Test
	public void whenBound3Then014() {
		int bound = 3;
		int[] result = Square.calculate(bound);
		int[] expected = new int[]{0, 1, 4};
		Assert.assertArrayEquals(expected, result);
	}
}