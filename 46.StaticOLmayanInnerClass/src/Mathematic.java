
import java.util.Scanner;


public class Mathematic {

private double pi=Math.PI;
    


public class factorial{
    
    public void factorial_procces(){
        
        Scanner scan = new Scanner(System.in);
        int fact=1;
        
        System.out.println("please enter a number for factorial: ");
        int number =scan.nextInt();
        
        for(int i=1; i<number; i++){
            
            fact*=i;
            
        }
        
        System.out.println("faactorial: " + fact);
        
    }
    
}


public class prime{     // asal
    
    public boolean prime_control(int number){
        
        int i=2;
        while(i<number){
            
            if(number%i==0)
            {
                return false;             
            }
             i++;
        }
                return true;        
    }
   }



public class field{

  public class circle_field{
      
      public void field_circle(int radius){
        
        System.out.println("field of circle: " + (pi*radius*radius)); 
        
  // private olarak tanımlamıştık alt sınıfı olduğu için erişebiliyor.
  
     }
      
  }
}


}
