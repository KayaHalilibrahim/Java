
public class triengular extends Shape{
    
    private int a;
    private int b;
    private int c;
    
    public triengular(String name,int a,int b,int c){
        
        super(name);
        
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    
    public void calculate_field(){
        
        double u = (a+b+c)/2.0;

     double field = Math.sqrt(u*(u-a)*(u-b)*(u-c));
     
        System.out.println("field of the " +getName()+": " +field);
     
    }


    
    
    
    
}
