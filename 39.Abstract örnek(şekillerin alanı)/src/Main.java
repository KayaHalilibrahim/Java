
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
       Scanner scan= new Scanner(System.in);
        
        String procces="\tProcces\n"+
                "1.field of square\n"+
                "2.field of triengular\n"+
                "3.field of circle\n"+
                "q. get out.";
        
        
        while(true){
            
            System.out.println("*******************************");
            System.out.println(procces);
            System.out.println("*******************************");
            
            System.out.println("please choose a procces:");
            String choose= scan.nextLine();
            
            Shape shape=null;
            
            if(choose.equals("q")){
                
                System.out.println("get out the programing");
                break;
            }
            
            else if(choose.equals("1")){
                System.out.print("edge of square:");
                int edge=scan.nextInt();
                
                scan.nextLine();  // hata olmaması için.
                
                
                
                shape= new Square("square1", edge);  // kare gibi davranır.
                
                shape.calculate_field();
            }
            else if(choose.equals("2")){
                
                System.out.println("please enter the value of edges: ");
                int a=scan.nextInt();
                int b=scan.nextInt();
                int c=scan.nextInt();
                
                scan.nextLine();
                
                shape = new triengular("triengular1", a, b, c);
                
                shape.calculate_field();

            }
            else if(choose.equals("3")){
                
                System.out.println("please enter the value of radius: ");
                int r= scan.nextInt();
                
                scan.nextLine();
                
                shape =new Circle("circle1", r);
                
                shape.calculate_field();
                
            }
            
            else 
            {
                System.out.println("you entered wrong value");
            }
            
            
            
        }
        
    }
    
}
