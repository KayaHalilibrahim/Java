
import java.util.Scanner;


public class test {
    
    public static void main(String[] args) {
        System.out.println("wellcome to beyblade program.");
        System.out.println("for get out pres 'q' ");
        
        Scanner scan=new Scanner(System.in);
        
    
    while(true)
    {
        System.out.println("which beyblade do you want to create: ");
        String procces=scan.nextLine();
        
        if(procces.equals("q"))
        {
            System.out.println("get out the program");
            break;
        }
        
        else 
        {
            factoryofbeyblade factory= new factoryofbeyblade();
            
            beyblade bey =factory.producebeyblade(procces);
                    
                    
            if(bey==null)
            {
                System.out.println("please enter valid beyblade name: ");
            }
            else 
            {
                bey.attack();
                bey.monster();
            }
                    
                    
        }
    }
   
    
    
    
    
    }
}
