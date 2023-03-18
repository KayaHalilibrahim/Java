
public class ComplexFaceRealLifeService implements IuserCheckService{
    
    
    public boolean checkUser(User user){
    
    if(user.getAge()>=18 && user.getName().startsWith("mu")){
        return true;
        
    }
    return false;
    
}
    
}
