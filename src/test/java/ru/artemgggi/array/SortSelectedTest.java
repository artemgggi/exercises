package ru.artemgggi.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

	@Test
	public void whenSort() {
		int[] data = new int[] {3, 4, 1, 2, 5};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[] {1, 2, 3, 4, 5};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenSort2() {
		int[] data = new int[] {6, 5, 4};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[] {4, 5, 6};
		Assert.assertArrayEquals(expected, result);
	}
}