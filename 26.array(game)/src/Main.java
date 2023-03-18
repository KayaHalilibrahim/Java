
import java.util.Scanner;

public class Main {
    
     private static card[][] cards=new card[2][2];  // mainin içinde ve dışında geçerli olabilmesi için.
    
    public static void main(String[] args) {
        
        
        
       
        
         cards[0][0]=new card('A');
        cards[0][1]=new card('E');
        cards[1][0]=new card('A');
        cards[1][1]=new card('E');
     

        
        
        gameboard();
        
        while (finishgame()==false)
        {
            gameboard();
            makeguess();
            
        }
        
        
        
        
        
        
    }
    
    public static void makeguess(){
        
       Scanner scan=new Scanner(System.in);
        
        System.out.println("first guess (enter value of i and j with a space)...");
        
        int i1=scan.nextInt();
        int j1=scan.nextInt();

        
        cards[i1][j1].setGuees(true);
        gameboard();
        
        
         System.out.println("second guess (enter value of i and j with a space)...");
        
        int i2=scan.nextInt();
        int j2=scan.nextInt();
        
        if(cards[i1][j1].getValue()==cards[i2][j2].getValue())
        {
            cards[i2][j2].setGuees(true);
        }
        else
        {
            cards[i1][j1].setGuees(false);
        }
        
    }
    
    
    
    
    
    
    
    
    public static void gameboard(){
        for(int i=0; i<2; i++)
        {
                for(int j=0; j<2; j++)
                {
                if(cards[i][j].isGuees())
                {
                    System.out.print(" |" + cards[i][j].getValue()+ "|  ");
                    
                }
                else 
                {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
         
          } 
        
         
    public static boolean finishgame(){
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(cards[i][j].isGuees()==false)
                {
                    return false;
                }
            }
        }
        
         return true ;
    }
    
    
        
         
 
}
