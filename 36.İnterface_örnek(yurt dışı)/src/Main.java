
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("-wellcome to GAP Airport-");
          
        String conditions= "\tRules for Abroad\n"+
                "You must not have any foraign travel bans.\n"+
                "You must pay the full fee of 15 TL.\n"+
                "You must have a visa to the country you are travelling to.";
        
        String note="You must meet all the foreign conditions.";
        
        
        
        while(true)
        {
            System.out.println("*****************************************");
            System.out.println(conditions);
            System.out.println("*****************************************");
           
            
            Traveller traveller1 = new Traveller();
            
            System.out.println("The fee is checked.");
            
            Thread.sleep(3000);  // 3 saniye durması için.
            
            traveller1.abroad_fee_control();
            if(traveller1.abroad_fee_control() == false)
            {
                System.out.println(note);
                continue; // döngünün başına gider.
            }
            
           
             System.out.println("The political ban is checked.");
             Thread.sleep(3000);
            
             traveller1.palitical_ban_control();
             if(traveller1.palitical_ban_control()==false)
             {
                 System.out.println(note);
                 continue;
             }
             
             System.out.println("The visa is checked.");
             Thread.sleep(3000);
             traveller1.visa_status_control();
             
             if(traveller1.visa_status_control()==false)
             {
                 System.out.println(note);
                 continue;
             }
             
             System.out.println("Your procces is ok.You can go abroad..");
             break;
             
             
             
             
            
        }
        
    }
    
}
