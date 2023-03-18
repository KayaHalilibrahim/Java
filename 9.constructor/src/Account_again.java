
public class Account_again {
    
    public static void main(String[] args)
    {
       // kendi oluşturduğumuz constructor.
    
        
    work mycar = new work();
    
     //   mycar.setName("halil");
      //  mycar.setSalary(1500);

    
   work human=new work("student",0,"mustafa");
    
   
        System.out.println(mycar.getJob());
        System.out.println(mycar.getSalary());
        System.out.println(mycar.getName());
        
        
        System.out.println(human.getJob());
        System.out.println(human.getSalary());
        System.out.println(human.getName());
        
    }   
}
