// inheritance(kalıtım) aynı özelliği tekrar almak yerine diğer sınıftan almak. 


// bu sınıfa sperClass veya BaseClass denir.
// özellikler burdan alındığı için.

public class employee {
    
    private String name;
    private int salary;
    private  String department;

    public employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        
        
    }
    
    
     // fonksiyonlar  ( 3 tane)
    
    
    public void work()
    {
        System.out.println("worker is working");
    }
    public void showinfo()
    {
        System.out.println("name : "+ this.getName());  // this kullanabiliriz.
        System.out.println("salary: " + getSalary());
        System.out.println("department: " + getDepartment());
    }
    
    public void changedepartment(String newdepartment)
    {
        System.out.println("department is cahnging.");
        this.setDepartment(newdepartment);
     
        System.out.println("new department: " +  getDepartment());
    }
 // set getler.
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getSalary() {
        return salary;
    }

    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    public String getDepartment() {
        return department;
    }

   
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
