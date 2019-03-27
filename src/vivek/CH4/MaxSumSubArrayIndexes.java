package vivek.CH4;
/*
 * This Program is to find the indices of the max sum subarray
 */
public class MaxSumSubArrayIndexes {

	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int sum = 0;
		int start = 0;
		int end=0;
		int s = 0;
		int maxSofar = 0;
		int max = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			max = max + a[i];
			
			if(max < 0) {
				max = 0;
				start = i+1;
			}
			
			else if(max > maxSofar) {
				s = start;
				end = i;
				maxSofar = max;
			}
		}
		
		System.out.println(s + ", " + end);
	}

}
