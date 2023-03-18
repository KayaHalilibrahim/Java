
import java.util.Scanner;



public class Main{
    public static void main(String[] args){
        
        Scanner scanner= new Scanner(System.in);
        
       float midterm1,midterm2,final_exam;
       float average;
       
        System.out.println("****average point******");
       
        System.out.print("enter the midterm exam1: ");
        midterm1 = scanner.nextInt();
        
        System.out.print("enter the midterm exam2: ");
        midterm2 = scanner.nextInt();
        
        System.out.print("enter the final exam: ");
        final_exam = scanner.nextInt();
    
        average=(float)((midterm1*30/100)+(midterm2*30/100)+(final_exam*40/100));
        
        System.out.println("your average point: " + average);
        
        if(average>=90)
        {
            System.out.println("your point: AA");
        }
        else if(average<90 && average>=85)
        {
            System.out.println("your point: BA");
        }
        else if(average<85 && average>=80)
        {
            System.out.println("your point: BB");
        }
        else if(average<80 && average>=75)
        {
            System.out.println("your point: CB");
        }
        else if(average<75 && average>= 70)
        {
            System.out.println("your point: CC");
        }
        else if(average<70 && average>= 65)
        {
            System.out.println("your point: DC");
        }
        else if(average<65 && average>= 60)
        {
            System.out.println("your point: DD");
        }
        else if(average<60 && average>= 55)
        {
            System.out.println("your point: FD");
        }
        else if(average<55 && average>= 50)
        {
            System.out.println("your point: FF");
        }
                
        
        
    }    
    
}