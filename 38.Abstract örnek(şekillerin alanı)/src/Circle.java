
public class Circle extends Shape{

    private int radius;     // yarıçap.
    
public Circle(String name,int radius){
    
    super(name);
    this.radius=radius;
  }


public void calculate_field(){
    
    System.out.println("field of the " + getName() +": "+ (Math.PI*radius*radius) );
}





}