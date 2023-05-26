// final olarak tanımlanan özelliğe sadece bir kere değer verebiliyoruz sonradan değiştiremiyoruz.

public class Main {
    
    public static void main(String[] args) {
     
      FinalTest f1 = new FinalTest("Obje1");
        
        FinalTest f2 = new FinalTest("Obje2");
        
        
        System.out.println("Number of object: " + f1.numberObject);    
        System.out.println("Number of object: " + f2.numberObject);
        
        // numberObject static olmadığı için objeye özgüdür.
        // yani aslında değeri değişmiyor sadece her obje için count değerine bağlı.
        
        
       // f2.numberObject=10;   -> hata alırız.   
        

        System.out.println("------------------------------");

        System.out.println(Math.PI);   //static ve final olarak tanımlanmış.
    
        System.out.println("------------------------------");
        
        
        System.out.println("Data Name: " + DataBase.nameDataBase);
        System.out.println("User name: " + DataBase.userName);
        System.out.println("Pasword: " + DataBase.pasword);  
        
    }
}
