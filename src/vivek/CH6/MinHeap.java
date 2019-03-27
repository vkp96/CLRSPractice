package vivek.CH6;

public class MinHeap {

	static int heapSize;
	
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 4, 3, 8, 7};
		
		buildMinHeap(a);
		
		printArray(a);
	}
	
	private static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		
	}

	private static void buildMinHeap(int[] a) {
		
		heapSize = a.length;
		for(int i = heapSize/2 ; i >= 0 ; i--) {
			minHeapify(a, i);
		}
		
	}

	private static void minHeapify(int[] a, int i) {
		
		int l = left(i);
		int r = right(i);
		int smallest = i;
		
		if(l < heapSize && a[l] < a[i])
			smallest = l;
		if(r < heapSize && a[r] < a[smallest])
			smallest = r;
		
		if(smallest != i) {
			swap(a, smallest, i);
			minHeapify(a, smallest);
		}
		
	}

	private static void swap(int[] a, int smallest, int i) {
		int temp = a[smallest];
		a[smallest] = a[i];
		a[i] = temp;
	}

	private static int right(int i) {
		return 2*i+2;
	}

	private static int left(int i) {
		return 2*i+1;
	}

}
