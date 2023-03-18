
public class work {
    
    private String job;
    private int salary;
    private String name;   
    
    public work()  // kendi constructorumuz.
    {
       /*  this.job="developer";
        this.salary=3000;
        this.name="yusuf";
        */
       
       this("teacher",14000," yusuf");
    }
   
    
    
    public work(String a,int b,String c)   //a=job,b=salary,c=name;
    {
       this.job=a;
       this.salary=b;
       this.name=c;
       
    }
    
 
    public String getJob() {
        return job;
    }

  
    public void setJob(String jobb) {
        job =jobb;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
       
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
