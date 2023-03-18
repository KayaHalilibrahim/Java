
import java.util.LinkedList;
import java.util.ListIterator;



public class Main {
    
    public static void print_list(LinkedList<String> araund){
     
        /*
        for(int i=0; i<araund.size(); i++)
        {
            System.out.println(araund.get(i));
        }
        */
        
        ListIterator<String> iterator = araund.listIterator();
        
        while(iterator.hasNext())   // iteratorun gittiği son referans.
        {
            System.out.println(iterator.next());  // bir sonraki referansı gösterir. 
        
        }
        
    }
    
    //--------------------------------------
    
    public static void add_sequenntially(LinkedList<String> araund,String recent){ 
        
                ListIterator<String> iterator = araund.listIterator();

        while(iterator.hasNext())  // herhangi bir objeyi göstteriyorsa true oluyor.
        {
         // sıralı ekleme.   
            int comp = iterator.next().compareTo(recent);  // karşılaştırma.
            
            if(comp==0)
            {
                System.out.println("you already have this elemet in your list.");
                
                return ;  // fonksiyonu bitirmek için değer dönmediği için hata vermedi. 
             }
            else if(comp<0)
            {
                // yeni değer iterator.next'ten daha büyük.whilenin başına dönüyor.
            
            // alfabetik olarak recent sonra geliyorsa sonuç <0 çıkıyor.
            
            }
            else 
            {
                iterator.previous();  // iterator bir geri gelir değeri iteratoru' un geldiği yere atarız.
            
                iterator.add(recent);
                
                return;
                
            }
            
        }
        
        iterator.add(recent);
        
    }
    
    /*
 eğer recent iteratordan büyükse -1 çıkıyor.
 eğer recent iteratordan küçükse +1 çıkıyor.
 eğr recent iteratora eşttse 0 çıkıyor.   
    */
    
   //-------------------------------------
    public static void main(String[] args) {
        
        LinkedList<String> place = new LinkedList<String>();
        
        
/*
        place.add("post office");
        place.add("Library");
        place.add("market");
        place.add("gym");
        place.add("home"); 
        
        print_list(place);
        
        System.out.println("---------------------------");
        
        
        
        
        place.add(4,"Shoping Mall");   // alış veriş merkezi.
        print_list(place);
          
    System.out.println("---------------------------");

                 
                 place.remove(3);  // silmek için ("gym") aynı işlemi yapar.
                 print_list(place);

*/         
                 
                 
add_sequenntially(place,"Post Office");
add_sequenntially(place,"Market");
add_sequenntially(place,"Home");

        print_list(place);
     
 // alfabetik olarak sıralıyor.       
        
        
  }  
}
