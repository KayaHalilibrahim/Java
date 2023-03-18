
// Stringler birer Class'tır.

public class Main {
    
    public static void main(String[] args) {
        
        String a = "ibrahim";
        
         //  String b = new String ("ibrahim"); ---> bu şekilde de yapabiliriz.
        
      
        
        /*
        
        System.out.println("number of words: " + a.length()); // ibrahim' in içindeki harf sayısı.
      
        System.out.println("index of the fourth: " + a.charAt(a.length()-4));
        System.out.println("index of second a: " + a.charAt(1));
        
        */
        
        // charAt  o indexteki karakteri gösterir.
        
        
        for(int i=0; i<a.length(); i++)
        {
            System.out.print(a.charAt(i)+"  ");
        }
        
        System.out.println("\n");
        
        System.out.println(a.startsWith("ibr"));  // doğru veya yanlış değer verir
        System.out.println(a.endsWith("im"));
        System.out.println(a.lastIndexOf('i'));  // indexOf deseeydik ilk i'nin indexsini gösterirdi.
        
        
        System.out.println(a.toLowerCase());  // a da ki tüm karakterleri küçük yapar.
        System.out.println(a.toUpperCase());
        
        
        System.out.println("******return the value from string to int**********");
        
        String d="1905";
        
        int c=Integer.parseInt(d);  // integer' a çevirir
        
        System.out.println(c);
        
        
        // sayıyı String'e çevirme
        
        int a1=2002;
        
        String b1= String.valueOf(a1);
        
        System.out.println(b1);  // string'a çevirir.
          
        
        
        
        System.out.println("--------------------");
        System.out.println("--------------------");   
        
        String c1="yusuf";
        String d1="yusuf";     
        
        if(c1==d1)
        {
            System.out.println("they are eqaul.");
        } 
        
        
        
         System.out.println("--------------------");
        System.out.println("--------------------");   
        
        String a3=new String("efe");    
        String b3=new String("efe");
        
        //a2 ve b2 bellekte farklı yerleri gösterirler.
        
       if(a3 == b3)  //a3.equals(b3) dersek içeriği kıyaslarız ve eşitler yazdırır.
        {
            System.out.println("they are eqaul.");
        } 
       else
       {
           System.out.println("they are not equal.");
       }
        
    }  
}
