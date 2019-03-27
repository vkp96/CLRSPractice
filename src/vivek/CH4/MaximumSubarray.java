 package vivek.CH4;
/*
 * Program to find the maximum sum subarray in an array containing  integer values
 * 
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int sum = 0;
		int start = 0;
		int end=0;
		
		int maxSofar = 0;
		int max = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			max = max+a[i];
			
			if(max < 0)
				max = 0;
			else if(max > maxSofar)
				maxSofar = max;
			
		}
		System.out.println(maxSofar);
	}

}
