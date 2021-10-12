package ru.artemgggi.array;

public class MatrixSum {
	public static int sum(int[][] array) {
		int res = 0;
		for (int row = 0; row < array.length; row++) {
			for (int cell = 0; cell < array[row].length; cell++) {
				res += array[row][cell];
			}
		}
		return res;
	}
}
