package ru.artemgggi.array;

public class MatrixCheck {

	public static char[] extractDiagonal(char[][] board) {
		char[] res = new char[board.length];
		for (int i = 0; i < board.length; i++) {
			res[i] = board[i][i];
		}
		return res;
	}

	public static boolean isWin(char[][] board) {
		boolean result = false;
		for (int i = 0; i < board.length; i++) {
			if ((MonoArray.monoHorizontal(board, i) || MonoArray.monoVertical(board, i))) {
				result = true;
				break;
			}
		}
		return result;
	}
}
