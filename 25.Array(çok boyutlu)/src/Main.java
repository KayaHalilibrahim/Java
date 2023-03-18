
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        
        int [][] matrix=new int[3][3];
        
        System.out.println("please enter the number of array: ");
        
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                 matrix[i][j]=scan.nextInt();
            }
        }
        System.out.println("your array: ");
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("\n");
        }
        
    }
    
}
