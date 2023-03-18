
public class account {
 
    public static void main(String[] args){
        
        
      // work account = new work();  // javanıın varsayılan constructor'u'.
        
        work myaccount= new work( );
        
        System.out.println(myaccount.getBalance());
        
        myaccount.withdraw(500);
        System.out.println(myaccount.getBalance());
        
    }
    
    
}
