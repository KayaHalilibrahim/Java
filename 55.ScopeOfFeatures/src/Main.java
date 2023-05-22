// kapsam özellikleri
// java otomoatik olarak en local(yerel) olanı kullanır.
public class Main {
    
    public static void main(String[] args) {
    
    ScopeClass scope1 = new ScopeClass();
    
 //   scope1.multiplyTeen();
    
    ScopeClass2.InternalClass scope2 = new ScopeClass2().new InternalClass();
    
    scope2.multiplyTeen();
    
    //    System.out.println(scope2.a);    erişemez
    
    
    ScopeClass2 s = new ScopeClass2();
    
        System.out.println("-------------------");
    
    s.InternalClassControl();
    
}
}
