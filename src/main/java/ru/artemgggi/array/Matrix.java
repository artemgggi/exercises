package ru.artemgggi.array;

import java.util.Arrays;

public class Matrix {
	public static int[][] multiple(int size) {
		/*
		  {{0, 1, 2, 3, 4}   {{0, 1, 2, 3, 4},{1, 1, 2, 3, 4},{2, 2, 4, 6, 8},{3, 3, 6, 9, 12}}
		   {1, 1, 2, 3, 4}
		   {2, 2, 4, 6, 8}
		   {3, 3, 6, 9, 12}}

		   {1, 2}  |{1, 2}, {2, 4}
		   {2, 4}  |
		 */
		int[][] array = new int[size][size];
		System.out.println(Arrays.deepToString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) * (j + 1);
			}
		}
		System.out.println(" ");
		System.out.println(Arrays.deepToString(array));
		return array;
	}
}
