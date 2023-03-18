import java.util.Scanner;


public class  kaya{
    
    public static void main(String[] args){
        
        int number;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("please enter a number between 1 and 7 for days of week: ");
        
        number= scanner.nextInt();
        
        switch(number){
            
            case 1:
            {
                System.out.println("monday");  // süslü parantez isteğe bağlı kullanabiliyoruz.
                break;
            }
            case 2:
                System.out.println("tuesday"); 
                break;
            case 3:
                System.out.println("wednesday");
                 break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("sunday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
               break;
            default:
                System.out.println("you entered wrong value.");
                break;
        }
            
            }
        }
        
 // break olmazsa diğer caseler sağlamasa bile yazdırır
 