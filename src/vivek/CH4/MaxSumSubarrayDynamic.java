package vivek.CH4;

public class MaxSumSubarrayDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int curr_max = a[0];
		int maxSoFar = Integer.MIN_VALUE;
		
		for(int i = 1; i < a.length ; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			maxSoFar = Math.max(maxSoFar, curr_max);
		}
		
		System.out.println(maxSoFar);
	}

}
