package sorting;

public class Insertion {

	public static <T extends Comparable<? super T>> void sort(T[] array) {
		if (array.length < 2)
		return;

		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j - 1].compareTo(array[j]) > 0) {
				Utils.swap(array, j, j - 1);
				j--;
			}
		}
	}

}
