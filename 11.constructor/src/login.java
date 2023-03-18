// true ya da false döndermmek için boolean kullandık.



import java.util.Scanner;

public class login {
    
    public boolean login(account control)
    {
        Scanner scan=new Scanner(System.in);
        String user_no;
        String pasword;
        
        System.out.println("user no: ");
        
        user_no=scan.nextLine();
        
        System.out.println("pasword: ");
        pasword=scan.nextLine();
        
        
        if(control.getUser_name().equals(user_no) && control .getPasword().equals(pasword))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
