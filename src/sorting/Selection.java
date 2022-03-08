package sorting;

public class Selection {

	public static <T extends Comparable<? super T>> void sort(T[] array) {
		if (array.length < 2)
			return;

		for (int i = 0; i < array.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[minIdx]) < 0)
					minIdx = j;
			}

			if (minIdx != i)
				Utils.swap(array, i, minIdx);
		}
	}

}
