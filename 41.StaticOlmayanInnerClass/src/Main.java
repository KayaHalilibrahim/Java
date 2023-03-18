
public class Main {
    
    public static void main(String[] args) {
        
        
        Mathematic.field field1 =new Mathematic.field();  
  // fonksiyonu static yapmazsak bu şekilde kullanmak zorundayız.      
 //static kullandığımız için.     
 
 field1.circle_field(5);
 
        System.out.println("----------------");
 
 Mathematic.field.circle_field(5);
 // metodu (fonksiyon) static yaptığımızda bu şekilde yazabiliriz.
 
    }
    
}
