
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in) ;
        
        
        System.out.println("welcome to problems of  math and physic");
        
        String procces="\tprocces\n"+
                "1.calculate circle field.\n"+
                "2.calculate perimeter of triangular.\n"+
                "3.calculate Inner produce of two vector\n"+
                "q. get out";
        
        
        while(true){
            System.out.println("------------------------");
            System.out.println(procces);
            System.out.println("------------------------");
            
            System.out.println("please choose a procces:");
            String Choose=scan.nextLine();
            
            
            if(Choose.equals("q"))
            {
                System.out.println("get out the program");
                break;
            }
            else if(Choose.equals("1")){
                
                System.out.println("enter the value of radius ");
                int r=scan.nextInt();
                
                scan.nextLine();
                
                Problem.Mathematics.cirle(r);
                
            }
            else if(Choose.equals("2")){
                
                System.out.println("enter value of the edges of triangular");
                int a=scan.nextInt();
                int b=scan.nextInt();
                int c=scan.nextInt();
                
                Problem.Mathematics.perimeter_triangular(a, b, c);
                
            }
            else if(Choose.equals("3")){
                
                Vector vec1= new Vector("Vector1");
                Vector vec2= new Vector("Vector2");
                
                Problem.physic.Inner_produce(vec1, vec2);

                
            }
            else 
            {
                System.out.println("invalid transaction.");
            }
            
            
            
            
        }
        
    }
    
}
