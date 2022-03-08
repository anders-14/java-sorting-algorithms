package sorting;

import java.util.Random;

public class Utils {

	public static <T> void swap(T[] array, int a, int b) {
		if (a < 0 || b < 0 || a >= array.length || b >= array.length)
			return;

		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	public static <T> void printArray(T[] array) {
		String out = "[ ";

		for (T el : array) {
			out += el == null ? "null " : el + " ";
		}

		out += "]";
		System.out.println(out);
	}

	public static Integer[] randomArray(int n) {
		Integer[] arr = new Integer[n];

		Random r = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = Math.abs(r.nextInt() % n);
		}

		return arr;
	}

	public static <T extends Comparable<? super T>> boolean validateSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].compareTo(array[i + 1]) > 0)
				return false;
		}

		return true;
	}

}
