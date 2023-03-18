import java.util.Scanner;

public class Main {
    public static void mul(int a,int b,int c)
    {
        System.out.println("multiplication value of three number: " + (a*b*c));
    }
    public static void mul(int a,int b)
    {
      System.out.println("multiplication value of two number: " + (a*b));
    }
    
    
     public static void sum(int a,int b,int c)
    {
        System.out.println("sum value of three number: " + (a+b+c));
    }
    
    public static void sum(int a,int b)
    {
      System.out.println("sum value of two number: " + (a+b));
    }
    
    public static void main(String[] args) { 
        
        String calculate_machine="1.summation(+)\n"
                               + "2.multiplication(*)";
        
        
        System.out.println(calculate_machine);
        
        Scanner scanner = new Scanner(System.in);
    int a,b,c;
    int choose;
    char operator;
    
       System.out.println("which operator do you want '+' or 'x': ");
            operator=scanner.next().charAt(0);
            
            if(operator=='+')
            {
        System.out.println("how many number do you want for sum 2 or 3: ");
        choose=scanner.nextInt();
        if(choose==2)
        {
            System.out.println("enter the value of two number: ");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
            sum(a, b);
        }
        else if(choose==3)
        {
            
            System.out.println("enter the value of three number: ");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                c=scanner.nextInt();
            sum(a, b, c);
        }
        else
        {
            System.out.println("please do not enter numbers other than 2 or 3.");
        }
            }
            
             if(operator=='*')
            {
        System.out.println("how many number do you want for multiplication 2 or 3: ");
        choose=scanner.nextInt();
        if(choose==2)
        {
            System.out.println("enter the value of two number: ");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
            mul(a, b);
        }
        else if(choose==3)
        {
            
            System.out.println("enter the value of three number: ");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                c=scanner.nextInt();
            mul(a, b, c);
        }
        else
        {
            System.out.println("please do not enter numbers other than 2 or 3.");
        }
            }
             else
             {
                 System.out.println("you entered wrong operator!!!");
             }
    
    
    
    
    
    }        
  }



