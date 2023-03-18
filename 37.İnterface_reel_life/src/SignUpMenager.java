
public class SignUpMenager {
    
    private IuserCheckService iuserCheckService;
    
    
    public SignUpMenager(IuserCheckService iuserCheckService){
        
        this.iuserCheckService=iuserCheckService;
        
    }
    
    
    public void signUp(User user){
        
        
        
        if(iuserCheckService.checkUser(user)){
            
            System.out.println("the user sign up." + user.getName());
            
        }
        else
        {
            System.out.println("user did not registered.");
        }
        
        
    }
    
}
