package vivek.CH4;
/*
 * Program to find maxSumSubarray using divide and conquer
 */
public class MaxSumSubArrayDivideAndConquer {
	
	 private static int maxSubCrossingArraySum(int[] arr, int low, int m, int high) {
		 
		 int sum = 0;
		 int left_sum = Integer.MIN_VALUE;
		 int right_sum = Integer.MIN_VALUE;
		 for(int i = m; i >= low ; i--) {
			 sum += arr[i];
			 if(left_sum < sum)
				 left_sum = sum;
		 }
		 sum = 0;
		 for(int i = m+1 ; i <= high ; i++) {
			 sum += arr[i];
			 if(right_sum < sum)
				 right_sum = sum;
		 }
		 
		 return left_sum + right_sum;
	}
	
	private static int maxSubArraySum(int[] arr, int low, int high) {
		if(low == high)
			return arr[low];
		
		int m = (low + high)/2;
		
		return Math.max(Math.max(maxSubArraySum(arr, m+1, high), maxSubArraySum(arr, low, m)) , maxSubCrossingArraySum(arr, low, m, high));
	}
	
	

	public static void main(String[] args) 
	    { 
	    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	    int n = arr.length; 
	    int max_sum = maxSubArraySum(arr, 0, n-1); 
	      
	    System.out.println("Maximum contiguous sum is "+ 
	                                         max_sum); 
	    } 
	
}
