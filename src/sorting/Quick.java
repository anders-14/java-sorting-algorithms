package sorting;

public class Quick {

	public static <T extends Comparable<? super T>> void sort(T[] array, int a, int b) {
		if (a >= b || a < 0)
			return;

		int p = partition(array, a, b);

		sort(array, a, p - 1);
		sort(array, p + 1, b);
	}

	private static <T extends Comparable<? super T>> int partition(T[] array, int a, int b) {
		T pivot = array[b];
		int i = a - 1;

		for (int j = a; j < b; j++) {
			if (array[j].compareTo(pivot) <= 0) {
				i++;
				Utils.swap(array, i, j);
			}
		}

		i++;
		Utils.swap(array, i, b);
		return i;
	}

}
