
public interface ITrying {
    
   // private int a=4;   > ınterfacenin içinde private alan oluşturamayız.
    // interfacelerden obje üretemiyoruz.
     
     public int a = 4;
   //  public int b;  -> setter, getter metodu ve constructor olmadığı için atama yapmamız gerekli.

     public static String word ="School";     // static yazmaya gerek yok, Java otomatik olarak static' e çeviriyor.
    
    public final int c =6;    // final kulamasakta olurdu.
      
    public static void test (){   // static olmayan metod ekleyemiyoruz.
        
        System.out.println("test...");
    }
    
}
