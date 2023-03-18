
public abstract class Shape {
    
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    
    abstract void calculate_field();
    
    //--------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
