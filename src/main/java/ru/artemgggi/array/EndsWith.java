package ru.artemgggi.array;

public class EndsWith {
	public static boolean endsWith(char[] word, char[] post) {
		boolean result = true;
		for (int i = post.length - 1; i >= 0; i--) {
			if (post[i] != word[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
