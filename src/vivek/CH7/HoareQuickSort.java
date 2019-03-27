package vivek.CH7;

/*
 * Program for quicksort
 */
public class HoareQuickSort {

	public static void main(String[] args) {
		int[] a = { 2, 1, 2, 4, 3, 7, 8 };

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
			int q = hoarePartition(a, p, r);
			quickSort(a, p, q);
			quickSort(a, q + 1, r);
		}
	}

	public static int hoarePartition(int[] a, int p, int r) {
		int x = a[p];
		int i = p-1;
		int j = r+1;
		while (true) {
			do {
				j = j-1;
			}while(a[j] > x);
			
			do {
				i = i+1;
			}while(a[i] < x);
			/*while (a[j] > x)
				j--;
			while (a[i] < x)
				i++;*/
			if (i < j)
				swap(a, i, j);
			else
				return j;
		}
	}

	public static void swap(int[] a, int largest, int i) {
		int temp = a[largest];
		a[largest] = a[i];
		a[i] = temp;
	}

}
