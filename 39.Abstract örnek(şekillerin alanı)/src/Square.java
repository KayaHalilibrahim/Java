
public class Square extends Shape{

    private int edge;        // kenar
    
    
public Square(String name,int edge){
    
   super(name);
   this.edge=edge;
   
}

public void calculate_field(){
    
    System.out.println("field of the " + getName()+": " +(edge*edge));
    
}
    
    
}
