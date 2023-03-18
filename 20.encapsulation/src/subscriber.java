// natural gasses subscriber  doğal gaz abonesi.

// subscriber=abone.

public class subscriber {
    
    public String name;
    public int balance;
    public String city;
    
 
    public void  usenaturalgas(int amount)
    {
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
        System.out.println("balance " + balance);
    }
    
}
