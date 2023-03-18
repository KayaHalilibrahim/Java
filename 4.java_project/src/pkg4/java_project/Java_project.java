
// *********metodlar(fonksiyonlar)***********

/* 
metodlar : erşim belirleyici(public gibi)-- ekstra özellikler(static)--dönüs tipi ----fonksiyon adı(parameterler)
 fonksiyon bloğu

fonksiyonun yapacağı işlemler burda

*/

package pkg4.java_project;




import java.util.Scanner;


public class Java_project {

    // ****************************************
  
public static void factorial()
{

         Scanner scanner = new Scanner(System.in);       

    
     int number;
     int sum=1;
     int i=1;
     
        System.out.print("enter a number: ");
        number=scanner.nextInt();

    while(i<=number)
    {
        sum*=i;
          i++;
    }
    System.out.println("result: " + sum);

}

//***********************************



    public static void main(String[] args) {
    
        
        System.out.println("the function is working..");
                
        for(int j=0; j<3; j++)
        {
        
        factorial();
        }
    }
    
}
