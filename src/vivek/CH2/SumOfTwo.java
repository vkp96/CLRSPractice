package vivek.CH2;

public class SumOfTwo {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 8;
		int index = -1;
		int i;
						// this snippet takes O(n logn)
		/*
		 * for(i = 0; i < a.length ; i++) {
		 * 
		 * index = BinarySearch.binarySearch(a, 0, a.length-1, sum-a[i]);
		 * 
		 * if(index != -1) { break; } }
		 * 
		 * if(index != -1) System.out.println("The two elements are: " + a[i] +", " +
		 * a[index]); else System.out.println("Element not found in the array");
		 */
		
		// While this takes only O(n)
		
		i = 0;
		int j = a.length-1;
		while (i < j) {
			if(a[i] + a[j] == sum) {
				System.out.println("true");
				break;
			}
			else if(a[i] + a[j] < sum)
				i++;
			else
				j--;
		}
		//System.out.println("false");
	}

}
