
import java.util.Scanner;


public class Main {

public static void main(String[] args ){
    
  
    System.out.println("**Find the winner of exam**");

    Scanner scan = new Scanner(System.in);
    
    String procces= "---Procces---\n"
            + "1. Procces of the Grup_A \n"
            + "2. Procces of the Grup B \n"
            + "q. Get out";
   
    
       System.out.println("--------------------------------");
          System.out.println(procces);
       System.out.println("--------------------------------");
       
       

    while(true){
        
    
        
        // first student
       System.out.print("name of first student name: ");
            String name1 = scan.nextLine();
            System.out.println("Nets(Turkish math literature physics) : ");
            
            int Turkish1= scan.nextInt();
            int math1= scan.nextInt();
            int literature1 = scan.nextInt();
            int physics1 = scan.nextInt();
                        scan.nextLine();

            
            // second student
                 System.out.print("name of second student name: ");
            String name2 = scan.nextLine();
            System.out.println("Nets(Turkish math literature physics) : ");
            
            int Turkish2= scan.nextInt();
            int math2= scan.nextInt();
            int literature2 = scan.nextInt();
            int physics2 = scan.nextInt();      
                    scan.nextLine();

     
            
                 System.out.print("name of third student name: ");
            String name3 = scan.nextLine();
            System.out.println("Nets(Turkish math literature physics) : ");
            
            int Turkish3= scan.nextInt();
            int math3= scan.nextInt();
            int literature3 = scan.nextInt();
            int physics3 = scan.nextInt();
            
            scan.nextLine();
            
        System.out.println("enter one procces");
        String choose = scan.nextLine();
        
        if (choose.equals("q")){
            System.out.println("exiting the program.");
            break;
            
        }
        else if(choose.equals("1")){
           Grup_A student1 = new Grup_A(Turkish1, math1, literature1, physics1, name1);
           Grup_A student2 = new Grup_A(Turkish2, math2, literature2, physics2, name2);
           Grup_A student3 = new Grup_A(Turkish3, math3, literature3, physics3, name3);   
              Grup_A winner =    first(student1, student2, student3);
            System.out.println("The winner Grup of A : "  + winner.getName());
                     System.out.println("Point of the winner Grup A : " + winner.calculatePoint());
        }
        
        else if(choose.equals("2")){
           Grup_B student1 = new Grup_B(Turkish1, math1, literature1, physics1, name1);
           Grup_B student2 = new Grup_B(Turkish2, math2, literature2, physics2, name2);
           Grup_B student3 = new Grup_B(Turkish3, math3, literature3, physics3, name3);
            Grup_B winner =    first(student1, student2, student3);
            System.out.println("The winner Grup of A : "  + winner.getName());
                        System.out.println("Point of the winner Grup B: " + winner.calculatePoint());

        }
        
        
        else{
            System.out.println("invalid operation.");
        }
        
    }
   
    
}

public  static <T extends Exam> T first(T t1, T t2, T t3){
    
    if(t1.calculatePoint()> t2.calculatePoint()  && t1.calculatePoint()>t3.calculatePoint()){
        return t1;
    }
    else if(t2.calculatePoint()> t1.calculatePoint()  && t2.calculatePoint()>t3.calculatePoint()){
        return t2;
    }
    else   if(t3.calculatePoint()> t1.calculatePoint()  && t3.calculatePoint()>t1.calculatePoint()){
        return t3
                ;
    }
    else{
        return t1;
    }
}
