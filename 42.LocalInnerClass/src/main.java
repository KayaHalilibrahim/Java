//Local sınnıfları metodların içinde kullanıyoruz.
//başka metodlardan erişemiyoruz,metoda özgü oluyor.
// public static gibi anahtar kelimeleri kullanamıyoruz çünkü bunları sınıflarda kullanabiliyoruz.



public class main {
    public static void main(String[] args) {
        
  // sadecee main metodunda geçerli.       
        class field{   // public ya da static kullanamıyoruz.
            
            public void circle_field(int radius){
                
                System.out.println("field of the circle: "  + (Math.PI*radius*radius));
                
            }
        }
        
        field field1= new field();
        field field2 = new field();
        
        field1.circle_field(5);
        field2.circle_field(10);
        
    }
    
    
    public static void trying(){
        
       // field field3= new field();  ----> erişemeyiz.
        
    }
    
}
