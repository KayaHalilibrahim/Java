import java.util.Scanner;

public class atm {
    
    public void work(account acc)
    {
        
     login log =new login();
     
     Scanner scan= new Scanner(System.in);
        
        System.out.println("**wellcome bank**");
        
        System.out.println("**************************");
        
        System.out.println("**enter for user**");
        
        System.out.println("**************************");
        
        int number=3;   // giriş hakkı. 
        
        while(true)
        {
            if(log.login(acc)) // true
            {
                System.out.println("succesfull");
                break;
            }
            else
            {
                System.out.println("fail");
                number--;
                System.out.println("remaining  right of entry: " + number);
            }
            if(number==0)
            {
                System.out.println("finish your right of entry.");
            }
            return;  // sonlandırmak için.
        }
        
        System.out.println("*************************************");
        
        String proccesses="1.procces-enter the balance\n"
                +"2.procces-deposit money\n"
                +"3.procces-withdraw money\n"
                +"enter 'q' for get out.";
        
        
        System.out.println("**************************");
        
        System.out.println(proccesses);
        
        while (true)
        {
            System.out.println("please enter a procces: ");
            String procces =scan.nextLine();
            
            if(procces.equals("q"))
            {
                break;
            }
            else if(procces.equals("1"))
            {
                System.out.println("your balance: " + acc.getBalance());
            }
            else if(procces.equals("2"))
            {
                System.out.println("how many money do you deposit: ");
                int amounnt = scan.nextInt();
                scan.nextLine();
                acc.deposit(amounnt);
            }
            else if(procces.equals("3"))
            {
                System.out.println("how many money do you withdraw: ");
                int amount=scan.nextInt();
                scan.nextLine();
                acc.withdraw(amount);
            }
            else
            {
                System.out.println("invalid transaction.");  // geçersiz işlem.
            }
        }
        
    }
}
