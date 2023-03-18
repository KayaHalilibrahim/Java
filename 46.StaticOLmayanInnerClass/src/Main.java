
import java.util.Scanner;

//static olmayan inner class.

public class Main {
    
    public static void main(String[] args) {
        
        

        
    Mathematic.factorial fac = new Mathematic().new factorial();
    // factroriyele erişebilmek için ilk önce Mathematic' i oluşturduk.
   
    Mathematic.prime prime_number = new Mathematic().new prime();
   
    Mathematic.field.circle_field field2=new Mathematic().new field().new circle_field(); 

   
   Scanner scan = new Scanner(System.in);
   
        System.out.println("enter a number: ");
        int number= scan.nextInt();
        
        if(prime_number.prime_control(number)==true){
            System.out.println("this number is prime.");
        }
        else
        {
            System.out.println("ths number is not prime.");
        }
        
        fac.factorial_procces();
        field2.field_circle(5);
        
    
   
   
   
    }
    
    
}
