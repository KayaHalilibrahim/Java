// abstract sınıflarda hem özeellik var hem normal metod var hemde abstract metod var.


public abstract class Shape {
    
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    
    public void sayname()
    {
        System.out.println("This object is " + name);
    }
    
   
    
    abstract void calculate_area();
   
    // soyut metod
    // gövdesiz metod oluyor ve alt sınıflar bu metodu kullanmak zorundadır.
    // farklı sınıflarda farklı şekilde kullanılıcağı için abstract kullandık.
    //--------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
}
