package vivek.CH8;
 
import java.io.*;
import java.util.*;

class RadixSort {

	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		radixsort(arr, n);
		printArray(arr);
	}
	
	public static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	public static void countSort(int arr[], int n, int expo) {
		int output[] = new int[n]; 
		int i;
		int count[] = new int[10]; // since there are 10 digits only
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < n; i++)
			count[(arr[i] / expo) % 10]++;   // gives the expo'th digit

		//each index maintains no. of elements less than or equal to it
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / expo) % 10] - 1] = arr[i];
			count[(arr[i] / expo) % 10]--;
		}

		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	public static void radixsort(int arr[], int n) {
		int m = getMax(arr, n);

		for (int expo = 1; m / expo > 0; expo *= 10)
			countSort(arr, n, expo);
	}

	public static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}

}