
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*** welcome to program of exercise ***\n");
        
        String exercise="\t****moves****\n\n"+"1.squat\t"+"\t2.pushup\t"+ "3.situp\n";
        
        
        System.out.println(exercise);
        
        System.out.println("\tcreate a exercise proram: \n");
        
        System.out.print("enter number of the squat: ");
        int a=scan.nextInt();
        
        System.out.print("enter number of the pushup: ");
        int b=scan.nextInt();
        
        System.out.print("enter number of the situp: ");
        int c=scan.nextInt();
        
        
        
        exercise exe = new exercise(a, b, c);
        
        
        System.out.println("\nyour exercise is starting");
        
        
        while(exe.finishexercise()==false)
        {
            
            scan.nextLine();  // hata vermemesi için.
            
            System.out.println("please choose a type of move(squat,pushup,situp): " );
            String type=scan.nextLine();
            
            System.out.println("how many of this moves will you make: ");
            int x=scan.nextInt();
            
            scan.nextLine();
            
            exe.move(type,x);
        }
    }
    
}
