import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		int[]  array = {1,2,3,4,5,6,7,8};
		
		HelperArray.toprint(array);   // static ile nesne üretmeden metodlarına ulaşabiliyoruz.
		
		
		System.out.println("\n--------------------------")	;	
	
		System.out.print(Arrays.toString(array));  // diziyi yazdırmayı sağlar.
		
     	System.out.print("\n--------------------------\n");
				
     	Arrays.fill(array,10);  // Array'ın tüm elemanlarını verilen sayı ile değiştirir.
				
		System.out.print(Arrays.toString(array));
		
		System.out.print("\n--------------------------\n");
		
        array=HelperArray.fill(array,10);
		
		System.out.print(Arrays.toString(array));
     	
		System.out.print("\n--------------------------\n");
		
        Arrays.fill(array,2,5,7);  // verilen aralıktaki değerleri verilen değerlerle değiştirir.
		
		System.out.print(Arrays.toString(array));
		
		System.out.print("\n--------------------------\n");
		
		int[] array2= {5,2,7,2,4,2,8};
		
		//  Arrays.sort(array2); --->  diziyi küçükten büyüğe sıralar.
		
		System.out.print(Arrays.toString(array2)); 
		
		System.out.print("\n--------------------------\n");
		
		System.out.print(Arrays.binarySearch(array2, 2));  // girilen değerin index'ini bulur.
		
		// binraysearch ilk olarak orta değerden bakmaya başlar.
		
		System.out.print("\n--------------------------\n");
		
		int[] array3 = Arrays.copyOf(array2, 3);  // verilen aralığa kadar kopyalar.
		
		//int[] array3 = Arrays.copyOfRange(array2, 3,5);  -->aralıktaki değerleri kopyalar.
		
		System.out.print(Arrays.toString(array3));
		
		System.out.print("\n--------------------------\n");
		
		System.out.print(Arrays.equals(array2, array3));   // eşitlik durumunu kontrol eder.
		
		
  }	
}
