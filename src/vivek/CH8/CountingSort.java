package vivek.CH8;
/*
 * Counting sort Program
 */
public class CountingSort {

	public static void main(String[] args) {
		int[] a = {0, 2, 2, 1, 1, 3, 4, 5};
		int max = max(a);
		System.out.println(max);
		int[] b = new int[a.length];
		countingSort(a, b, max);
		printArray(b);
	}
	
	public static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
	
	public static void countingSort(int[] a, int[] b, int k) {
		int[] c = new int[k+1];
		
		for(int i = 0 ; i <= k ; i++) { //initialize all auxiliary array elements to 0
			c[i] = 0;
		}
		
		for(int j = 0 ; j < a.length ; j++) {
			c[a[j]] = c[a[j]] + 1;					//initialize the count of elements
		}
		
		for(int i = 1 ; i <= k ; i++) {
			c[i] = c[i] + c[i-1];					//fill in no. of elements smaller than equal to at index
		}
		
		printArray(c);
		
		for(int j = a.length-1 ; j > 0 ; j--) {
			b[c[a[j]]-1] = a[j];					//put the element at the right position in output array
			c[a[j]] = c[a[j]] -1;					// decrease the count so that next time position is right
		}
		
	}
	
	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int x : a) {
			max = (max <= x)? x : max;
		}
		return max;
	}
}
