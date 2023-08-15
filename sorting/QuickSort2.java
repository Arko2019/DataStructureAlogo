package sorting;

public class QuickSort2 {

	static void sort(int[] a, int l, int h) {
		if (l < h) {
			int pivot = partition(a, l, h);
			sort(a, l, pivot - 1);
			sort(a, pivot + 1, h);
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

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
