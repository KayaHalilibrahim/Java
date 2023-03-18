
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    public static void tour_cities(LinkedList<String> town) {
        
        ListIterator<String> iterator= town.listIterator();
        
        int procces;
        
        print_procces();
        
        
        Scanner scan = new Scanner(System.in);
        
        if(!iterator.hasNext())
        {
            System.out.println("there is no anything city.");
        }
        
            boolean out = false; 
            boolean next =true;
            
            
            while(!out)
            {
                System.out.println("choose a procces: ");
                 procces=scan.nextInt();
                 
                 switch(procces){
                     
                     case 0:print_procces();
                     break;
                     case 1:
                         
                         if(!next)
                         {
                             iterator.next();
                         }
                         next=true;
                         
                         if(iterator.hasNext()) // gösterdiği bir şey var mı.
                         {
                             System.out.println(" goin to the city " + iterator.next());
                         }
                         else
                         {
                             System.out.println("there is no city to go to.");
                             
                             next=true;
                         }
                         break;
                         
                     case 2:
                         
                         if(next)
                         {
                             if (iterator.hasPrevious()){
                                 iterator.previous();
                             }
                         }
                         next=false;
                         
                         if(iterator.hasPrevious()){
                             
                             System.out.println("going to the city " + iterator.previous());
                         }
                         else 
                         {
                             System.out.println("the city tour has begun.");
                         }
                         break;
               
                     case 3:  
                         out=true;
                         System.out.println("get out the programing.");
                         break;
                     
                 }
                 

            }
        
        
    }
    public static void print_procces(){
        
        System.out.println("0 - show procces.");
        System.out.println("1 - go next city.");
        System.out.println("2 - go previous city.");
        System.out.println("3 - get out the apply.");
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        LinkedList<String> city = new LinkedList<String>();
     
        
        city.add("Ankara");
        city.add("Şanlıurfa");
        city.add("Balıkesir");

       tour_cities(city);
        
    }
    
    
}
