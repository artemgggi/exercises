package ru.artemgggi.array;

public class Defragment {
	public static String[] compress(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				if (array[j - 1] == null) {
					array[j - 1] = array[j];
					array[j] = null;

					System.out.println();
				}
			}
		}
		return  array;
}

	public static void main(String[] args) {
		String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
		String[] compressed = compress(input);
		System.out.println();
		for (int i = 0; i < compressed.length; i++) {
			System.out.println(compressed[i] + " ");
		}
	}
}
