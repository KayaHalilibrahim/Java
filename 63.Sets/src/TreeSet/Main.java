/*

                   ------TreeSet---------
1. Elementleri depolamak için Tree yani ağaç yapısını kullanır.
2. Elementleri alfabetik olarak sıralar.

 */
package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        
        Set<String> tSet = new TreeSet();
        
        tSet.add("Java");
        tSet.add("python");
        tSet.add("C++");
        tSet.add("Javascript");
        tSet.add("Php");
        
        tSet.add("Php");
     
         for(String n : tSet){
            System.out.println(n);
        }
    }                                              
}
