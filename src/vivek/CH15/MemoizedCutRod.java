package vivek.CH15;
/*
 * Top down memoization solution of the rod cutting problem
 */
public class MemoizedCutRod {

	public static void main(String[] args) {
		
		int price[] = {1, 8, 9, 10, 17, 17, 20, 24, 30};
		
		int n = price.length;
		
		System.out.println(memoizedCutRod(price,n));  //33 since index 2,7 gives the highest possible value
		
	}
	
	private static int memoizedCutRod(int[] price, int n) {
		int[] r = new int[n+1];
		for(int i = 0 ; i <= n ; i++) {
			r[i] = Integer.MIN_VALUE;
		}
		return memoizedCutRodAux(price, n, r);
	}
	
	private static int memoizedCutRodAux(int[] price, int n, int[] r) {
		int q;
		if(r[n] >= 0)
			return r[n];
		if(n == 0)
			q = 0;
		else {
			
			q = Integer.MIN_VALUE;
			
			for(int i = 0 ; i < n ; i++) {
				q = Math.max(q, price[i] + memoizedCutRodAux(price, n-i-1, r)); //if we don't give -1 here it will be infinite recursion
			}
			
			r[n] = q;
		}
		return q;
	}
}
