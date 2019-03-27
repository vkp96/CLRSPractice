package vivek.CH6;

public class HeapSort {
	
	static int heapSize;
	
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 4, 3, 7, 8};
		
		heapSort(a);
		
		printArray(a);
	}
	
	private static void heapSort(int[] a) {
		heapSize = a.length;
		
		buildMaxHeap(a);
		
		for(int i = --heapSize ; i >= 1 ; i--) {
			swap(a, 0, i);
			heapSize--;
			maxHeapify(a, 0);
		}
	}
	
	public static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static void buildMaxHeap(int[] a) {
		for(int i = heapSize/2  ; i >= 0 ; i--) {
			maxHeapify(a, i);
		}
		
	}

	public static void maxHeapify(int[] a, int i) {
		
		int l = left(i);
		int r = right(i);
		int largest = i;
		
		if(l < heapSize && a[l] > a[i])
			largest = l;
		if(r < heapSize && a[r] > a[largest])
			largest = r;
		
		if(largest != i) {
			swap(a, largest, i);
			maxHeapify(a, largest);
		}
		
	}

	public static void swap(int[] a, int largest, int i) {
		int temp = a[largest];
		a[largest] = a[i];
		a[i] = temp;
	}

	private static int right(int i) {
		return 2*i+2;
	}

	private static int left(int i) {
		return 2*i+1;
	}

}
