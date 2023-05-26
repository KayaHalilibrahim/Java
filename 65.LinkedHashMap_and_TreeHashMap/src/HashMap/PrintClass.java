package HashMap;


import java.util.Collection;
import java.util.Map;


public class PrintClass{
    
    public static void printMap(Map<Integer,String> map){
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");
       
     /*   for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
*/
     
     
     System.out.println(map.keySet());

   System.out.println("---------------------------");     

     for (Integer key : map.keySet()){
         System.out.println("Key: "+ key + " ----> Value:. " + map.get(key));
     }
     
     
        System.out.println("\n---------------------Other Print Type--------------------");
        System.out.println("**********Only values*********");
     
        Collection<String> values = map.values();
        
        for (String s : values){
            System.out.println(s);
        }
        
    }
    
}
