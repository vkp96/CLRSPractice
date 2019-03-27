package vivek.CH7;
/*
 * Program for quicksort
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 4, 3, 7, 8 };

		quickSort(a, 0, a.length - 1);

		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static void quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	
	public static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p-1;
		for(int j = p ; j < r ; j++ ) {
			if(a[j] <= x) {
				i = i+1;
				swap(a, i, j);
			}
		}
		swap(a, i+1, r);
		return i+1;
	}
	
	public static void swap(int[] a, int largest, int i) {
		int temp = a[largest];
		a[largest] = a[i];
		a[i] = temp;
	}

}
