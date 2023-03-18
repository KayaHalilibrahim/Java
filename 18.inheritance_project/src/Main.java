
import java.time.DayOfWeek;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class Main {
    
    
    public static void main(String[] args){
        
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("enter the name of IT worker: ");
        String nameıt=scan.nextLine();
        
        System.out.println("enter the surname of It worker: ");
        String surnameıt=scan.nextLine();
        
        System.out.println("which languages does he know: :");
        String lang=scan.nextLine();
        
        System.out.println("how many salary is he earning: ");
        int salary=scan.nextInt();
        
        Developer ıt =new Developer(nameıt, surnameıt, salary, lang);
        
        
        
        System.out.println("enter the name of manager: ");
        String namemanege=scan.nextLine();
        
        String ch=scan.nextLine();
        
        System.out.println("enter the surname of manage: ");
        String surnamemanage=scan.nextLine();
        
        System.out.println("how many people under is he(ook after): :");
        int resp=scan.nextInt();
        
        System.out.println("how many salary is he earning: ");
        int salary2=scan.nextInt();
        
        
        Manager man1 =new Manager(namemanege, surnamemanage, salary2, resp);
        
        
        String procces ="1.for get out pres the 'q'\n"+
                        "2.for developer pres 1\n"+
                        "3.for manager pres 2";
        
        
        
        
    
        System.out.println("******************************");
        
        System.out.println(procces);
        
        System.out.println("******************************");
        
        System.out.println("please choose enter a procces: ");
        char choose =scan.next().charAt(0);
        
        while(true)
        {
            if(choose=='q')
            {
                System.out.println("get out the programing.");
                break;
            }
            else if(choose=='1')
            {
                while(true)
                {
                    
                    String proc= "1. for get out pres 'q' \n" +
                                  "2.for  format pres '1' \n"+
                                  "3. for show information '2' \n";
                            
                    System.out.println("*********************");
                    System.out.println(proc);
                    System.out.println("*********************");
                    
                    System.out.println("please enter a procces ");
                    char proc1=scan.next().charAt(0);
                    
                    if(proc1=='q')
                    {
                        System.out.println("get out the developer procces.");
                        break;
                    }
                    else if(proc1=='1')
                    {
                        ıt.formatname("Android");
                    }
                    else if(proc1=='2')
                    {
                        ıt.showinfo(ıt.getLanguages());
                    }
                    else 
                    {
                        System.out.println("wrong procces!!!!");
                    }
                    
                }
                
            }
            else if(choose=='2')
            {
                while (true)
                {
                     String proc= "1. for get out pres 'q' \n" +
                                  "2.for  raise pres '1' \n"+
                                  "3. for show information '2' \n";
                     
                     System.out.println("*************************");
                    System.out.println(proc);
                    System.out.println("***************************");
                    
                    System.out.println("please enter a procces ");
                    char proc2=scan.next().charAt(0);
                    
                    if(proc2=='q')
                    {
                        System.out.println("get oout the procces of the manager");
                    }
                     if(proc2=='1')
                            {
                                man1.makeraise(500);
                            }
                     else if(proc2=='2')
                     {
                         man1.getRespeople();
                     }
                     else 
                     {
                         System.out.println("wrong procces. be carefull.");
                     }
                    
                }
            }
        }
        
        
        
    }
    
}
