


public class work {
    
    private String no;
    private double balance;
    private String name;
    private String phone;

    
    // **************************
    
   public work ()
   {
       
       System.out.println("my constructor.");       
       // bu alan javanın varsayılan constructoru için.
       
   }
   public work(String noo,double balan,String nam,String phon)
   {
       no=noo;    // eğer ismimler aynı olsaysdı this kullanırdık.
       balance=balan=500;
       name=nam;
       phone=phon;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNo() {
        return no;
    }

   
    public void setNo(String no) {
        this.no = no;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    // ******* fonksiyonlar**********
    
    public void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("you do not have this amount.");
            
        }
        else
        {
        this.balance-=amount;   // this kullamasakta olur.
                System.out.println("your new balance: " + balance);

        }
        
    }
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("your new balance: " + balance);
    }
    
    
    
}
