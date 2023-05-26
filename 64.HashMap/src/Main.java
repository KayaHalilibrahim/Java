
import java.util.HashMap;
import java.util.Map;

/*
Map class'ı hiçbir sınıftan implement etmez(Collection sınıfınfan implement  etmez).

HashMap 
1.Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her Key'e karşılık gelen bir tane değer bulunur.
2.Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
3.Elementleri tıpkı Hashset gibi ekleme sırasına göre depolanmaz.

*/
public class Main {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap= new HashMap<>();
        
        hashMap.put(10, "Java");
        hashMap.put(30,"Python");
        hashMap.put(50, "php");
        hashMap.put(20, "Php");
       
        hashMap.put(50,"Javascript");    // önceden Key' i 50 olanı silip yeni değeri ekler.(Güncelleme).
        
        System.out.println(hashMap);
        
        System.out.println("--------------------------");
        
        System.out.println(hashMap.get(30));
        
        System.out.println(hashMap.get(100));   // null
        
        
        
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Key: "+ entry.getKey() + "------------> Value: "+ entry.getValue());
        }
        
     
        
    }
    
}
