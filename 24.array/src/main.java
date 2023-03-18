import java.util.Arrays;  // array'ın sıralanması için gerekli.
import java.util.Scanner;

public class main {
    
    public static int[] array(int number)
    {
        Scanner scan = new Scanner (System.in);
        
        int[] output =new int [number];
        
        for(int i=0; i<number; i++){
            output[i]=scan.nextInt();
        }
        return output;
    }
    //----------------------------------------------
    
    public static void printarray(int[] array)
    {
        for(int i=0;i<array.length; i++)
        {
            System.out.println(i + ". element: " + array[i]);
        }
        System.out.println("other procces");
    }
    
    //-------------------------------------------------
    
    public static void array_sort(int[] array){
        
        Arrays.sort(array);
        printarray(array);
        
        
    }
    
    public static void main(String[] args) {
        
        int [] a;
        
        a=array(5);
        printarray(a);
        
        array_sort(a);
        
    }
    
}
