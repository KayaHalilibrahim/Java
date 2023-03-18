
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;


public class Main {
    
    private static singers artiste=new singers();  // özellik olarak bu class'a ekledik.(composition).
    
    private static Scanner scan = new Scanner(System.in);
    
    public static void printprocces(){
        
        
        
        System.out.println("\t 0-show the procces.");
        System.out.println("\t 1-showed the singers.");
        System.out.println("\t 2-Add the singer.");
        System.out.println("\t 3-Update the singer.");
        System.out.println("\t 4-deleted the singer.");
        System.out.println("\t 5-search the singer.");
        System.out.println("\t 6-get out the procces..");

        
    }
    
    public static void show_procces()
    {
        printprocces();
    }
    public static void look()
    {
        artiste.print_singer();
    }
    public static void added()
    {
        System.out.println("which singers do you want the add:");
        
        String name=scan.nextLine();
        
        artiste.Add_singer(name);
    }
    public static void update()
    {
        System.out.println("which pozition do you want the update: ");
        int poz=scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("which name do you want the update on this pozition:");
        String new_name =scan.nextLine();
        
        artiste.update_order(new_name, (poz-1));
        
    }
    public static void delete()
    {
        System.out.println("which pozition do you want the delete: ");
        int number= scan.nextInt();
        
        artiste.delete_singer(number-1);
    }
    public static void search()
    {
        System.out.println("which singer do you search:");
        String name = scan.nextLine();
        
        artiste.search_singer(name);
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("\t welcome apply to singers... ");
        
        printprocces();
        
        boolean out = false;
        
        int procces;
        
        while(!out)  // çıkışa eşit ise devam et.
        {
            System.out.print("chooese a proces: ");
            procces=scan.nextInt();
            
            scan.nextLine();
            
            
            switch(procces){
                
                
                case 0:
                    show_procces();
                    break;
                case 1:
                    look();
                    break;
                case 2:
                    added();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5: 
                    search();
                    break;
                case 6: out=true;
                    System.out.println("get out the programing.");
                    break;
                
            }
            
        }
        
    }
    
    
   
    
    
}
