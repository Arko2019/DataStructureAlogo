package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		QuickSort2.sort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	static void sort(int a[], int l, int h) {

		if (l < h) {
			int piovot = partition(a, l, h);
			sort(a, l, piovot - 1);
			sort(a, piovot + 1, h);
		}
	}

	static private int partition(int[] a, int l, int h) {
		int pivot = a[h];
		int i = l;
		int j = h;
		while (i < j) {
			while (a[i] <= pivot && i < j) {
				i++;
			}
			while (a[j] >= pivot && i < j) {
				j--;
			}
			if (i < j) {
				swap(a, i, j);
			}
		}
		swap(a, j, h);
		return j;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
