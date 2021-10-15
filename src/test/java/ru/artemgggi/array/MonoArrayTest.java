package ru.artemgggi.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonoArrayTest {

	@Test
	public void whenHasMonoHorizontal() {
		char[][] input = {
				{' ', ' ', ' '},
				{'X', 'X', 'X'},
				{' ', ' ', ' '},
		};
		int row = 1;
		boolean result = MonoArray.monoHorizontal(input, row);
		Assert.assertTrue(result);
	}

	@Test
	public void whenHasMonoVertical() {
		char[][] input = {
				{' ', ' ', 'X'},
				{' ', ' ', 'X'},
				{' ', ' ', 'X'},
		};
	}
}