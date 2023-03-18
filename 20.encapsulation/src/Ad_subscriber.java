
public class Ad_subscriber {
    
 private String nname;
 private int balance=120;   // eğer değer   verilmeze 120 kalır.
 private String city;
 
 public Ad_subscriber(String name, int balance,String city)
 {
     this.nname=name;
     
     if(balance>=0 && balance<=120)
       {
         this.balance=balance;                    
        }
     
    // eğer kullanıcı 0 ile 120 arasında bir sayı girerse bakiyemiz güncellenir.    
 
         this.city=city;

  }
    
    public void usenaturalgas(int amount) {
        if(amount>balance)
        {
            System.out.println("not enought balance");
        }
        else
        {
            balance-=amount;
            
            if(this.balance<=0)
            {
                System.out.println("balance is over");
            }
            else
            {
                System.out.println("new balance " + balance);
            }
        }
    }
    
    public void learnbalance(){
        System.out.println("balance " + this.balance);
    }
    
    
    
    
    
}
