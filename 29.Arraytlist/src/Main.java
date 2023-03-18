// arrylarda ooluşturduğumuz dizinin boyutunun değiştiremiyorduk.
// arrayListlerde değişiklik yapabiliyoruz.



import java.util.ArrayList;

public class Main {
    
    
    
   public static void write(ArrayList<String> A){
 
       System.out.println("-----------------with function--------------");
       
      for(String b : A)
        {
            
            System.out.println(b);
        }
       
       
       
   }
    
    
    
    public static void main(String[] args) {
        
   
    
    ArrayList<String> Arr= new ArrayList<String>();
    
    Arr.add("Metelica");
    Arr.add("Gun's n Ross");
    Arr.add("Black Sabbath");
    Arr.add("Iron Maiden");
    Arr.add("Metelica");
    
        

      
        
      // Arr.remove("Metelica");  // diziden eleman kaldırmak için.
       //  Arr.remove(0);       // diziden eleman kaldırmak için.
       
       

       
        System.out.println(Arr.indexOf("Black Sabbath"));
        
       //System.out.println(Arr.lastIndexOf("Metelica"));  // bir sonraki metelicanın kaçıncı sırada olduğunu öğrenmek için.
       
       
        Arr.set(4,"Megadeth");
               
        for(int i=0; i<Arr.size(); i++)
        {
            System.out.println(Arr.get(i));
        }
    
        
        write(Arr);
        
   }  
}
