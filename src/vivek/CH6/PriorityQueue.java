package vivek.CH6;
/*
 * Program to implement priority queue based on algorithm from cormen
 */
public class PriorityQueue {

	static int heapSize;
	
	public static void main(String[] args) {
		
		int[] a = {2, 1, 5, 4, 3, 7, 8, -1};
		
		buildMaxHeap(a);
		printArray(a);
		
		System.out.println("returns the max element in queue : " + heap_maximum(a));
		System.out.println("pops returns the max element in queue : " + extractMax(a));
		
		printArray(a);
		
		System.out.println("pops returns the max element in queue : " + extractMax(a));
		
		printArray(a);
		
		increaseKey(a, 10, 3);
		
		printArray(a);
		
		maxHeapInsert(a, 7);
		
		printArray(a);
	}
	
	public static void maxHeapInsert(int[]a, int key) {
		heapSize++;
		a[heapSize] = Integer.MIN_VALUE;
		increaseKey(a, key, heapSize);
	}
	
	public static void increaseKey(int[] a, int key, int i) {
		if(a[i] >= key)
			System.out.println("Seriosuly? whats the point?");
		//a[i] = key;
		while(i > 0 && key >= a[parent(i)]) {
			a[i] = a[parent(i)];
			i = parent(i);
		}
		a[i] = key;
	}
	
	public static int parent(int i) {
		return (i-1)/2 ;
	}
	
	public static int heap_maximum(int[] a) {
		return a[0];
	}
	
	public static int extractMax(int[] a) {
		int max = a[0];
		a[0] = a[heapSize--];
		maxHeapify(a, 0);
		return max;
	}
	
	public static void printArray(int[] a) {
		for (int j = 0; j <= heapSize; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
	
	public static void buildMaxHeap(int[] a) {
		heapSize = a.length-1;
		for(int i = heapSize/2 ; i >= 0 ; i--) {
			maxHeapify(a,i);
		}
	}
	
	public static void maxHeapify(int[] a, int i) {
		int left = left(i);
		int right = right(i);
		int largest = i;
		if(left <= heapSize && a[left] > a[i])
			largest = left;
		if(right <= heapSize && a[right] > a[largest])
			largest = right;
		
		if(largest != i) {
			swap(a, largest, i);
			maxHeapify(a, largest);
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
	}
	
	public static int left(int i) {
		return 2*i+1;
	}
	
	public static int right(int i) {
		return 2*i+2;
	}

}
