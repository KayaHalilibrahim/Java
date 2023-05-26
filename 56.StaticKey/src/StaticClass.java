
import javax.script.ScriptEngine;

// sattic olarak tanımladığımı için her obje oluşturulduğunda kaldığı yerden devam edecek.(bellekte sadece bir kere olışurlar).
// Eğer static olarak tanımlamasaydık her obje için sıfırdan başlayacaktı.
public class StaticClass {
    
    public static int numberObjecct =0;
    private static String name;
    
    public StaticClass(String name){
        this.name = name;
        numberObjecct++;
    }
    
    public static String getName(){
        return name;    // static olan bir alandan static olmayan bir alanı kulllanamayız.( eğer private String name olsaydı hata alırdık).
    }
    
}
