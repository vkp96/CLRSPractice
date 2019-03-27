package vivek.sorting;

import java.util.concurrent.TimeUnit;

public class MergeSort {

	public static void merge(int a[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0 ; i < n1 ; i++)
			L[i] = a[i+p];
		for(int j = 0 ; j < n2 ; j++)
			R[j] = a[j+q+1];
		//R[n2] = 9999;
		//L[n1] = 9999;
		
		int i = 0;
		int j = 0;
		int k = p;
		
	/*	for( k = p; k <= r; k++) {
			if(L[i] < R[j]) {
				a[k] = L[i];
				i++;
			}else {
				a[k] = R[j];
				j++;
			}
		}*/
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				a[k++] = L[i++];
			}
			else {
				a[k++] = R[j++];
			}
		}
		while(i < n1) {
			a[k++] = L[i++];
		}
		while(j < n2) {
			a[k++] = R[j++];
		}
		
	}
	
	public static void mergeSort(int a[], int p, int r) {
		
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(a, p, q);
			mergeSort(a, q+1, r);
			merge(a,p,q,r);
		}
		
	}

	public static void main(String[] args) {
		final long startTime = System.nanoTime();

		int[] a = { 5, 2, 4, 1, 3, 6 };

		int p = 0;
		int r = a.length;

		mergeSort(a, p, r-1);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		final long duration = System.nanoTime() - startTime;

		long seconds = TimeUnit.NANOSECONDS.toSeconds(duration);

		System.out.println("time taken is: " + duration + "nanoseconds");
	}

}
