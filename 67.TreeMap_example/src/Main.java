
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//bir metinde bir kelimenin kaç kere geçtiğini bulma.

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a word:");
        String text = scan.nextLine();
        
        Map<Character ,Integer> frequency = new TreeMap<>();
   
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if(frequency.containsKey(c)){
                frequency.replace(c, frequency.get(c)+1);
                
            }
            else{
                frequency.put(c, 1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry : frequency.entrySet()){
            System.out.println("Character: "+ entry.getKey()+ " :" + entry.getValue());
        }
    }
    
}
