
public class Manager extends Employee {
    
    private int respeople;
    
    public Manager(String name2, String surname2,int no2,int res)
    {
       
      super(name2, surname2, no2);
      
      this.respeople=res;
    
    }

    
    //*************************
    public int getRespeople() {
        return respeople;
    }

    public void setRespeople(int respeople) {
        this.respeople = respeople;
    }
    // ************************
    
    public void showinfo()
    {
        super.showinfo();
        System.out.println("number of responsible people:  " + respeople);
    }
    
    public void makeraise(int amount)
    {
        System.out.println(getName()+ " amount of raise " + amount);
    }
    
}
