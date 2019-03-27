package vivek.CH8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Porgram for bucketSort
 */
public class BucketSort {
	
	public static void main(String[] args) {
		double[] a = {0.0, 0.2, 0.2, 0.1, 0.1, 0.3, 0.4, 0.5};
		printArray(a);
		bucketSort(a);
		printArray(a);
	}
	
	public static void bucketSort(double[] a) {
		int n = a.length;
		List<Double>[] bucket = new List[n];
		double[] b = new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			bucket[i] = new ArrayList<Double>();
		}
		for(int i = 0; i < n ; i++) {
			int j = (int) (n*a[i]);
			bucket[j].add(a[i]);
		}
		
		for(int i = 0; i < n ; i++) {
			Collections.sort(bucket[i]); //I know it is cheating okay!!
		}
		int k = 0;
		for(int i = 0; i < n ; i++) {
			for(int j = 0 ; j < bucket[i].size(); j++) {
				a[k++] = bucket[i].get(j);
			}
		}
	}
	
	public static void printArray(double[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}
