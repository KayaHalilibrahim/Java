
public class Main {
 
    public static void main(String[] args) {
        
        
    //    Shape shape =new Shape("shape");  abstractlardan interfacelerde olduğu gibi class oluşturamıyoruz.    
        
    
    Square square1 = new Square("square1", 6);
    Circle circle1= new Circle("circle1", 5);
    
    square1.calculate_area();
    circle1.calculate_area();
    
        System.out.println("------------------------------");
    
    Shape shape= new Square("square2", 4);  //abstractan referans ürettik ve alt sınıfa direk referans oldu.
    shape.calculate_area();
    // shape.calculate_perimeter();  -- >hata verir.Çünü Shape bir abstract.  
    
    square1.calculate_perimeter();
    
    }
    
}
