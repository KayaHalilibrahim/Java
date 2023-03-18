
public class Main {
    
    public static void main(String[] args) {
        
    
    SignUpMenager signUpMenager=new SignUpMenager(new ComplexFaceRealLifeService());
    
    // AgeUserChecService yapsaydık sadece yaşı kontrol ederdi.
    
    
    signUpMenager.signUp(new User(1,"mustafa",26));
    
 }
}