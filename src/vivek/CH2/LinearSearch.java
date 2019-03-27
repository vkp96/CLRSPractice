package vivek.CH2;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {1,3,2,4,5};
		
		int key = 5;
		int index = -1;
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i] == key) {
				index = i;
			}
		}
		
		System.out.println("index is: " + index);
	}
	
}
