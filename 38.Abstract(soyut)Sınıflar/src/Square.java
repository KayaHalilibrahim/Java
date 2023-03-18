
public class Square extends Shape{  // inheritance yaptık.

    private  int edge;     // kenar.
    
    public Square(String name,int edge){
            
        super(name);
        this.edge=edge;
        
        }
        
    @Override
    void calculate_area() {
        
        System.out.println("Area of the " +getName()+ " is " + (edge*edge));
      
    }
    
    public void calculate_perimeter()
    {
        System.out.println("Perimeter of the " + getName()+ " is "+ (4*edge));
    }
    
    
    
    
    
}
