

// bu sınıfa Subclass denir

public class manager extends employee{  // hata olmaması için bir constructor oluştuemamız gerekiyor.
    
     // employee sınıfının özellikleirni al.
   
    private int person_of_responsible;  
    
    public manager(String name,int salary,String department,int responsible)  
    {
      
        super("halil", salary, department);    // miraas olarak aldığımız constructoru kullanmak istersek.
       
        this.person_of_responsible=responsible;
      
    }
     
       
    public void makeraise(int amount)
    {
        
        System.out.println("manager done " +amount+" $ raise" );
    }
    
    
    // ********* overloading **********
    
    // overloading employeedn aldığı bilgileri alacak ve ordakini iptal edecek.
// aynı metodu aldık özellik ekledik 

public void showinfo()
{/*
     System.out.println("name : "+ this.getName());  
        System.out.println("salary: " + getSalary());
        System.out.println("department: " + getDepartment());
         */
        super.showinfo();
        
        System.out.println("number of responsible person: "+person_of_responsible);
}
public void work()
{
    super.work();
    System.out.println("succesfull");
}
    



public void setresponsible(int responsible)  // int verirsek  return kullanmak gerekir.
        {
            this.person_of_responsible=responsible;      
            //return 0;
        }
    
     public int getresponsible()
        {
            return person_of_responsible;
        }
     
}
