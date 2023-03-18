import java.util.Arrays;

public class HelperArray {

public static void toprint(int[]  arr) {
	
	
	for(int i=0; i<arr.length; i++) {
		
	System.out.print(arr[i] +" ");	 
		
	}
	
}

 static int[] fill(int[] arr,int value) {
	
	for(int i=0; i<arr.length; i++) {
		
		arr[i]=value;
	}
	return arr;
}

 

	
}
