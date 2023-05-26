// kısaca özellik olarak aynılar
// Eğer değer eklemek isterseniz arraylist kullanamak daha avjantajlı
// Eğer değer değişikliği veya araya değer eklemek isterseniz linkedlist daha avantajlı.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
 
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist = new LinkedList<>();   // referans ile sıralama yapılır.
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        calculateTime("LinkedList", linkedlist);
        calculateTime("arrayList", arrayList);
        
        
        
        
    }
    
    public static void calculateTime(String data_type,List<Integer> list){
        
        // Listin sonuna değer ekleme.
        
        long start;
        long finish;
        
        start = System.currentTimeMillis();
        for (int i=0; i<10000 ; i++){
            
            list.add(0,i);    // bu şekilde LinkedList daha hızlı.
        }
        finish = System.currentTimeMillis();
       
        System.out.println(data_type +" time of add : " + (finish-start)+ " ms.");
        
    }
}

//list.add(i);  arraylist daha hızlı davranıyor.(sonuna eklenecekse arraylist daha hızlı).