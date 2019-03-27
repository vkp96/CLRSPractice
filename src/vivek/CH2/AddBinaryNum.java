package vivek.CH2;

public class AddBinaryNum {

	public static void main(String[] args) {
		
		int a[] = {1,1,1};
		int b[] = {1,1,1};
		int c[] = new int[a.length+1];
		int carry = 0;
		
		for(int i = a.length - 1 ; i >= 0 ; i--) {
			c[i+1] = (carry + a[i] + b[i]) % 2;
			carry = (carry +  a[i] + b[i]) / 2;
		}
		c[0] = carry;
		
		for(int i = 0 ; i < c.length ; i++)
			System.out.print(c[i]);
	}

}
