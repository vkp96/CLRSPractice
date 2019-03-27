package vivek.CH15;

public class NaiveCutRod {

	public static void main(String[] args) {
		
		int price[] = {1, 8, 9, 10, 17, 17, 20, 24, 30};
		
		int n = price.length;
		
		System.out.println(cutRod(price,n));  //33 since index 2,7 gives the highest possible value
		
	}
	
	private static int cutRod(int[] price, int n) {
		if(n == 0)
			return 0;
		int q = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			q = Math.max(q, price[i] + cutRod(price, n-i-1)); //if we don't give -1 here it will be infinite recursion
		}
		return q;
	}
	
}
