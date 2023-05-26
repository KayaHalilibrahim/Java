/*
 * Objelerimiz Keyler göre sıralanır.(Küçükten büyüğe doğru sıralanır.)
 */
package TreeHashMap;

import java.util.Map;
import java.util.TreeMap;
import HashMap.PrintClass;

public class Main {
    

 public static void main(String[] args) {
        
                 Map<Integer,String> treehashMap = new TreeMap<>();

                 PrintClass.printMap(treehashMap);    //Rakamları küçükten büyüğe doğru sıralar.
               
  }
}

/*
output:  (rakamları küçükten büyüğe göre sıralar).

1: Python
2: Php
5: Java
10: C++
100: C

*/