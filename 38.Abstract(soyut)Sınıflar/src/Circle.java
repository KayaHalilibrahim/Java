
public class Circle extends Shape{
    
    private int radius;
    
    public Circle(String  name,int radius){
        
        
        super(name);
        this.radius=radius;
        
    }
    
    void calculate_area(){
        
        System.out.println("are of " + getName() + " is " + (Math.PI*radius*radius ));
        
    }
    
    
    
    
    
}
