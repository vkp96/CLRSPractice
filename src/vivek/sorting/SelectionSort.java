package vivek.sorting;

import java.util.concurrent.TimeUnit;

public class SelectionSort {

	public static void main(String[] args) {
		
		final long startTime = System.nanoTime();
		int i = 0;
		int[] a = { 5, 2, 4, 6, 1, 3 };
		
		int min_index = 0;
		
		for (i = 0; i < a.length-1; i++) {
			
			min_index = i;
			
			for (int j = i; j < a.length; j++) {
				
				if (a[j] < a[min_index]) 
					min_index = j;
			
			}
			
			int temp = a[min_index];
			a[min_index] = a[i];
			a[i] = temp;
		}

		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		final long duration = System.nanoTime() - startTime;

		long seconds = TimeUnit.NANOSECONDS.toSeconds(duration);

		System.out.println("time taken is: " + duration + "nanoseconds");
	}
}
