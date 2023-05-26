
public class Main {
    
    public static void main(String[] args) {
        
        
       System.out.println( StaticClass.numberObjecct); 
        
        StaticClass s1 = new StaticClass("Halil");
        
        System.out.println( StaticClass.numberObjecct); 
                
        StaticClass s2 = new StaticClass("ibrahim");

        System.out.println( s1.numberObjecct);   // bu şekilde de verir.

        
        
        System.out.println("-------------------");
        
       sum(3,4,5);
    
        
    }
    
    public static void sum(int a, int b, int c){    // main static olduğu için bu fonksiyonun çalışabilmesi için static olması lazım.
        System.out.println(a+b+c);
    }
    
}
