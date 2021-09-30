package ru.artemgggi.loop;

public class Slash {
	public static void draw(int size) {
		for (int row = 0; row < size; row++) {
			for (int cell = 0; cell < size; cell++) {
				/*boolean left =
				boolean right =
				if (left) {
					System.out.println("0");
				} else if (right) {
					System.out.println("0");
				} else {
					System.out.println(" ");
				}*/
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("draw by 3");
		draw(3);

	}

}
