
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        
        //Baştan okunuşu ve sondan okunuşu aynı olan kelimeler.
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a text: ");
        String text = scanner.nextLine();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i =0; i<text.length()/2; i++){
           stack.push(text.charAt(i));
        }
        
   
        if (isPalindrom(text, stack)) {
            System.out.println("This text is a palindrom text..");
        }
        else{
            System.out.println("This text is not a palindrom text.");
        }
        
    }
    
    
    public static boolean isPalindrom(String text,Stack<Character> stack){
        for(int i=(text.length()/2)+1; i<text.length(); i++){
            if(text.charAt(i) != stack.pop()){
                return false;
                
            }
        }
         return true;
    }
}
