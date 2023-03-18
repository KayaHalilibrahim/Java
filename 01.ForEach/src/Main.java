
public class Main {
	
	public static void main(String[] args) {

	int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
	
	
	for(int[] a: array) {
		
	//	System.out.println(a[0]);   // 0. sütünu yazdırır.
		
		for(int b: a) {
		
			System.out.print(b + " ");
			
		}
		System.out.println();
	}
	
}

	
}