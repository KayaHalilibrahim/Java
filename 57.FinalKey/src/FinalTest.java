// final değerini constructor veya tanımlanırken vermemiz gerekli.
// final olarak oluşturulan değişkenlerde setter ve getter metodu ekleyemiyoruz.

public class FinalTest {
    
    public final int numberObject;
    private static int count =0;  // class'a ait.
    private final String name;
    
    
    
    public FinalTest(String name){
       
       this.name = name;
       count++;
       numberObject=count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        FinalTest.count = count;      //static değişkenler sınfa bağlı olduğundan this kullanamayız.
    }
    

    
}
