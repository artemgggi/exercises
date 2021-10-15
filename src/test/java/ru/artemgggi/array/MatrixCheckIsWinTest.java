package ru.artemgggi.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckIsWinTest {

	@Test
	public void whenDataMonoByTrueThenTrue() {
		char[][] input = {
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
		};
		boolean result = MatrixCheck.isWin(input);
		Assert.assertTrue(result);
	}

	@Test
	public void whenDataNotMonoByTrueThenFalse() {
		char[][] input = {
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
				{' ', 'X', ' ', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
		};
		boolean result = MatrixCheck.isWin(input);
		Assert.assertFalse(result);
	}

	@Test
	public void whenDataHMonoByTrueThenTrue() {
		char[][] input = {
				{' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' '},
				{'X', 'X', 'X', 'X', 'X'},
				{' ', ' ', 'X', ' ', ' '},
				{' ', ' ', 'X', ' ', ' '},
		};
		boolean result = MatrixCheck.isWin(input);
		Assert.assertTrue(result);


}