
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
       //  ArrayList<String> arraylist = new ArrayList<>();
        
       List<String> arraylist = new ArrayList<>();
      
       // add element
       arraylist.add("Java");  
        arraylist.add("Python");
        arraylist.add("C#");
        arraylist.add("C++");
        
        // acces to element
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(2));
        
       /* for(int i = 0; i<arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
*/
       
        System.out.println("--------------------------");
       
       for(String s : arraylist){
           System.out.println(s);
       }
       
           System.out.println("--------------------------");
       arraylist.remove(1);
       arraylist.remove("Java");
       
          for(String m : arraylist){
           System.out.println(m);
       }
       
    }
}
