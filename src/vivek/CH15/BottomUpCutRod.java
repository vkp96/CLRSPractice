package vivek.CH15;

public class BottomUpCutRod {

	public static void main(String[] args) {
		
		int price[] = {1, 8, 9, 10, 17, 17, 20, 24, 30};
		
		int n = price.length;
		
		System.out.println(bottomUpCutRod(price,n));  //33 since index 2,7 gives the highest possible value
		
	}

	private static int bottomUpCutRod(int[] price, int n) {
		
		int[] r = new int[n+1];
		
		r[0] = 0;
		
		for(int j = 1; j <= n ; j++) {
			
			int q = Integer.MIN_VALUE;
			
			for(int i = 0; i < j ; i++) {
				
				q = Math.max(q, price[i] + r[j-i-1]); // -1 since we have index starting at 0
				
			}
			
			r[j] = q;
		}
		
		return r[n];
	}
	
}
