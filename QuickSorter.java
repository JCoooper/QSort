
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
		}
	}

	public static int partition(int[] arr, int lo, int hi) { // i < piv or j > piv

		int pivotIndex = lo;
		int i = lo + 1;
		int j = hi;

		boolean flag = true;

		while (flag = true) { // i
			if (i < pivotIndex) {
				i++;
			} else if (i > pivotIndex) {
				flag = false;
			}

			while (flag = false) { // j
				if (j > pivotIndex) {
					j++;
				} else if (j < pivotIndex) {
					flag = true;
				}
			}
		}

		int te;
		te = arr[i];
		arr[pivotIndex] = te;
		pivotIndex = i;
		return pivotIndex;
	}
}
