package sorting;

public class Main {

	private enum Algorithm {
		INSERTION, SELECTION
	}

	private static final int COUNT = 32000;
	private static final int TIMES = 5;

	public static void main(String[] args) {
		for (int i = 0; i < TIMES; i++) {
			run(Algorithm.INSERTION);
			run(Algorithm.SELECTION);
		}
	}

	private static void run(Algorithm algo) {
		Integer[] arr = Utils.randomArray(COUNT);
		long sTime;
		long dur = 0;

		switch (algo) {
			case INSERTION:
				System.out.println("Insertion");
				sTime = System.nanoTime();
				Insertion.sort(arr);
				dur = (System.nanoTime() - sTime) / 1000000;
				break;
			case SELECTION:
				System.out.println("Selection");
				sTime = System.nanoTime();
				Selection.sort(arr);
				dur = (System.nanoTime() - sTime) / 1000000;
				break;
		}

		System.out.println("Duration: " + dur + " ms");
		System.out.println("Sorted:   " + Utils.validateSort(arr));
	}

}
