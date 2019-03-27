package vivek.sorting;

import java.util.concurrent.TimeUnit;

public class InsertionSort {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		
		int[] a = { 5, 2, 4, 6, 1, 3 };

		for(int j = 1 ; j < a.length ; j++) {
			
			int key = a[j];
			int i;
			for( i = j - 1 ; i >= 0 && a[i] > key; i--) {
				// change the condition for non increasing
				if(a[i] > a[i+1]) {
					a[i+1] = a[i];
					a[i] = key;
				}
				
			}
			
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		final long duration = System.nanoTime() - startTime;
		
		long seconds = TimeUnit.NANOSECONDS.toSeconds(duration);
		
		System.out.println("time taken is: " + duration + "nanoseconds");
	}
}
