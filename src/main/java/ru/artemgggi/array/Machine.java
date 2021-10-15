package ru.artemgggi.array;

import java.util.Arrays;

public class Machine {

	public static int[] change(int money, int price) {
		int[] coins = {10, 5, 2, 1};
		int[] res = new int[100];
		int size = 0;
		int change = money - price;

		for (int i = 0; i < coins.length; i++) {
			while (change >= coins[i]) {
				change = change - coins[i];
				res[size] = coins[i];
				size++;
			}
		}
		return Arrays.copyOf(res, size);
	}
}
