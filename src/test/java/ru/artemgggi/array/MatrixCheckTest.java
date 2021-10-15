package ru.artemgggi.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

	@Test
	public void whenDiagonalFullX() {
		char[][] input = {
				{'X', ' ', ' '},
				{' ', 'X', ' '},
				{' ', ' ', 'X'},
		};
		char[] result = MatrixCheck.extractDiagonal(input);
		char[] expected = {'X', 'X', 'X'};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenDiagonalFullOne() {
		char[][] input = {
				{'1', ' ', ' '},
				{' ', '1', ' '},
				{' ', ' ', '1'},
		};
		char[] result = MatrixCheck.extractDiagonal(input);
		char[] expected = {'1', '1', '1'};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenDiagonalMix() {
		char[][] input = {
				{'X', ' ', ' '},
				{' ', 'Y', ' '},
				{' ', ' ', 'Z'},
		};
		char[] result = MatrixCheck.extractDiagonal(input);
		char[] expected = {'X', 'Y', 'Z'};
		Assert.assertArrayEquals(expected, result);
	}
}