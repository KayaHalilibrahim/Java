
import java.util.Scanner;


public class Traveller implements Abroad_rules{
    
    private int fee;                // harç
    private boolean political_ban;
    private boolean  visa_Status;

    
    public Traveller() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("fee value: ");
        this.fee=scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Do you have a political ban: ");
         String answer=scan.nextLine();
         
         if(answer.equals("yes"))
         {
             this.political_ban=true;
         }
         else
         {
             this.political_ban=false;
         }
        System.out.println("Do you have visa: ");
        String answer2=scan.nextLine();
        
        if(answer2.equals("yes"))
         {
             this.visa_Status=true;
         }
         else
         {
             this.visa_Status=false;
         }
        
    }

 
    public boolean abroad_fee_control() {
        
        if(this.fee<15)
        {
            System.out.println("Please pay the international exit fee in full.");
            return false;
        }
        else
        {
            System.out.println("The foreign fee procces is ok.");
            return true;
        }
        
    }

 
    public boolean palitical_ban_control() {
        
        if(this.political_ban== true)
        {
            System.out.println("you had political ban.You can not go abroad.");
               return false;
        }
        else
        {
            System.out.println("you do not have a political ban.");
                return true;
        }
        
    }

   
    public boolean visa_status_control() {
        
        if(visa_Status==true)
        {
            System.out.println("procces of the visa is ok.");
            return true;
        }
        else
        {
            System.out.println("you do not have for this country.");
            return false;
        }
        
    }
    
    
    
    
    
}
