
// -------------array--------------

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
     
        
        // int[] a = new int [10];
      
 int[] a={30,40,50,60,70};   // 5 tane girdiğimiz için boyutu 5 oluyot.
      
        System.out.println(a[0]);
      
        System.out.println("lenght of the array: " + a.length);
        
        array2(a);
        
        System.out.println("--------------------");
        
       array1();
       
       
       int[] a1={1,2,3,4};
       int[] a2={1,2,3,4};
       
       if(Arrays.equals(a1,a2))
       {
           System.out.println("the values of the arrays equal");
       }
       // değerlerin eşit olup olamdığına bakıyor.
       
       
        
    }
    
    //----------------------------------------
     
    
    public static void array1()
        {
            
            System.out.println("------scanner----------");
            
            Scanner scan =new Scanner(System.in);
            
            String[] name=new String[5];
            
            System.out.println("enter the names");
            for (int i=0; i<5; i++)
            {
                name[i]=scan.nextLine();
            }
            
            for(int j=0; j<5; j++)
            {
                System.out.println((j+1) + ". name: " + name[j]);
            }
            
            
        } 
      
       
    //----------------------------------------
    
    
      public static void array2(int [] array){
        
        for(int i=0; i<array.length; i++)
        {
            System.out.println(i+ ".elements: " + array[i]);
        }
        
      
    }  

    
      
        
        
  }  
}
