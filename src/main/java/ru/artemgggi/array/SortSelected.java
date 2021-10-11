package ru.artemgggi.array;

public class SortSelected {
	public static int[] sort(int[] data) {
		for (int i = 0; i < data.length; i++) { // i - номер текущего шага
			int pos = i;
			int min = data[i];
			// цикл выбора наименьшего элемента
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < min) {
					pos = j; // pos - индекс наименьшего элемента
					min = data[j];
				}
			}
			data[pos] = data[i];
			data[i] = min; // меняем местами наименьший с array[i]
		}
		return data;
	}
}
