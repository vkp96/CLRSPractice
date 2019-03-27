package vivek.CH2;

public class BinarySearch {

	public static int binarySearch(int[] a, int low, int high, int key) {
		
		if(low <= high) { 				// this condition is for the case when element is at the extremes	
			
			int mid = (low+high)/2;
			if(a[mid] == key)
				return mid;
			else if(a[mid] > key)
				return binarySearch(a, low, mid, key);
			else
				return binarySearch(a, mid+1, high, key);
		}
		else
			return -1;					// the element does not exist in the array
	}
	
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int key = 5;
		int index;
		
		index = binarySearch(a, 0, a.length-1, key);
		
		if(index != -1)
			System.out.println("element found at index: " + index);
		else
			System.out.println("element not found in array");

	}

}
