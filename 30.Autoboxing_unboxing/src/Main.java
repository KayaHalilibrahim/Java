
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        
        
        ArrayList<String>  Arr = new ArrayList<String>();  
        
      /*  ArrayList<Integer>  Arr = new ArrayList<Integer>(); 
        
 yazdığımız şeyin referans olması lazım String bir Class olduğu için hata vermedi.
 int ilkel bir veri tipi olduğu için hata verdi. 
   */
      
      
      
    
 /*   int a=5;
    a. --------->ilkel veri olduğu için hata verdi
           
   */ 
 
 
 Integer a =5;
 
 // a.---->      Bu şekilde yaptığımızda sınıf cinsinden tanımmlıyor.Bu class'lara Wrapper Class denir.
    
 ArrayList<Integer> Arr2 = new ArrayList<Integer>();
 
 
 for(int i=0; i<10; i++)
 {
     Arr2.add(Integer.valueOf(i*4));  // Autoboxing ---> i ' yi kutuya alıyoruz
     //(Arr2.add(i*4)); dersek aynı sonucu verir java Autoboxing işlemini kendi içinde yapar.
 } 
 
 for(int i=0; i<Arr2.size(); i++)
 {
     System.out.println(Arr2.get(i).intValue());  // Unboxing   ----> kutudan i' yi çıkarıyoruz.
   // Arr2.get(i); dersek aynı sonucu verir java unboxing işlemini kendi içinde yapar.
 }
 
 
 
 
 
  }   
}
