// hesap işleri için  class


public class account {
 
    private String user_name;
    private String pasword;
    private int balance;

    public account(String user_name, String pasword, int balance) {
        this.user_name = user_name;
        this.pasword = pasword;
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

//  ************************************************
    
    // ******* fonksiyonlar ********
    
    
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("your new amount of money: " + balance);
    }
    public void withdraw(int amount)
    {
        if(balance - amount < 0)
        {
            System.out.println("you do not have this amount.");
        }
        else if(amount>2000)
        {
            System.out.println("please enter a avaible amount (<2000)");
        }
        else
        {
            balance-=amount;
            System.out.println("your new balance: " + balance);
        }
    }
    
 

    
}
