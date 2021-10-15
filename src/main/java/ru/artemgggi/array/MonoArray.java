package ru.artemgggi.array;

public class MonoArray {

	public static boolean monoHorizontal(char[][] board, int row) {
		boolean result = true;
		for (int line = 0; line < board[row].length; line++) {
			if (board[row][line] != 'X') {
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean monoVertical(char[][] board, int column) {
		boolean result = true;
		for (int line = 0; line < board.length; line++) {
			if (board[line][column] != 'X') {
				result = false;
				break;
			}
		}
		return result;
	}
}
