package ru.artemgggi.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

	@Test
	public void whenArrayHas5Then0() {
		int[] data = {5, 4, 3, 2};
		int el = 5;
		int result = FindLoop.indexOf(data, el);
		int expected = 0;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenArrayHas7Then1() {
		int[] data = {1, 7, 3, 6};
		int el = 7;
		int result = FindLoop.indexOf(data, el);
		int expected = 1;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenArrayHas10Then0() {
		int[] data = {10, 1, 5, 7};
		int el = 10;
		int result = FindLoop.indexOf(data, el);
		int expected = 0;
		Assert.assertEquals(expected, result);
	}
}