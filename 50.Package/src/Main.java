
//   import java.util.ArrayList ;      // jdk ile gelen paket
//  import java.util.Scanner;     // jdk ile gelen paket

// ikiside java.util paketinin içinde

import  java.util.*;   //yukarıda yazdığımız kütüphaneleri kullanmaya gerek kalmaz.(çünkü iksini de içeriyor).
import javax.xml.soap.Node;

   /*
   -Biribiri ile bağlantılı Classları aynı yere topluyoruz.
     -Class ve intefacelerin çakısmaması için kullanılır.
    -Benzer isimleri ayırt etmek için kullanılır
    -Biribiri ile bağlantılı Classları aynı yere topluyoruz.
    -Farklı paketlerde aynı isim class oluşturabiliriz.
    
-jdk8 de paket ve Class geliyor.
-Jar dosyalarını bir çok paketi barıdıran konteynir gibi düşünebiliriz.
-rt.jar dosyasının içindeki java util paketi var

    */
public class Main {
    
 
    
    public static void main(String[] args) {
        
      /*  Scanner scanner = new Scanner(System.in);
        
        ArrayList arraylist = new ArrayList
*/
      
        Node node1 = null;  // node sınıfından birden fazla var ama ayrı paketlerde bu yüzden kullanacağımız paketin kütüphanesini ekliyoruz.
        
        org.w3c.dom.Node Node2 = null;          // hangi paketten  olduğunu belirttik.(import etmek yerine kullanılabilir.)
        
        
        
    }
    
}
