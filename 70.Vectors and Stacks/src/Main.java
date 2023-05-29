// -------Stack-------
//LIFO --> Last in first out.

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
    
        Vector<String> vector = new Vector<>();
        
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("------------for each----------------------");

   
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        
        for(String s : vector){
            System.out.println(s);
        }
        
        System.out.println("--------------iterator--------------------");
        
        ListIterator<String> itr = vector.listIterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
                System.out.println("--------------Enumeration--------------------");

        
                Enumeration<String> enumeration = vector.elements();
                
                while (enumeration.hasMoreElements()) {
                    System.out.println(enumeration.nextElement()); 
            
        }
                
                System.out.println("----------------------------------------");
                
                System.out.println("First element: " + vector.firstElement());
                System.out.println("last element: " + vector.lastElement());
                
                
                System.out.println("******************Stack*********************");
                
                Stack<String> stack = new Stack <>();
                
                stack.add("Python");
               stack.push("Java");
               stack.push("C++");
               stack.push("Php");
               stack.push("Go");
                
                     System.out.println("------------for each----------------------");

               for (String s :  stack){
                   System.out.println(s);
               }
               
                    System.out.println("--------------Enumeration--------------------");

               Enumeration<String> enumeration2 = vector.elements();
               
               while (enumeration2.hasMoreElements()) {
                   System.out.println( enumeration2.nextElement()); 
        }
               
                System.out.println("---------------------other--------------------------");
                
                System.out.println(stack.peek());   //son giren elemanı gösterir.
                System.out.println(stack);
                
                System.out.println(stack.pop());   // son elemanı return ile dönderip siler.
                System.out.println(stack);
                
                System.out.println(stack.empty());   // dolu ya da boş olmasına göre true/false dönderir.
                
                
                System.out.println("-------------stack elemanları tek tek silme-----------------");
                while(!stack.empty()) {
            System.out.println(stack.pop());
             }
                
                  System.out.println(stack.empty());   // elemanlar silindiği için stack boştur --> true döner
                
    }
}
