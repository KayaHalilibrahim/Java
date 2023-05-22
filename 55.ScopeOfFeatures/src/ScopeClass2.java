// alt sınıftaki veriye ulaşmak için obje oluşturmalıyız.

public class ScopeClass2 {
    private int privateValue=30;
    
    public ScopeClass2(){
        
    }
    
    public void InternalClassControl(){
     InternalClass d = new InternalClass();
        System.out.println("Being checking..." + d.a);
    }
    
    
    public  class InternalClass {
        private int privateValue=20;   // this.privateValue kullanırsak bu değeri Kullanırız
        private int a=3;
        
        public  void multiplyTeen(){
            
      int privateValue=10;
             
            for (int i =1; i<6; i++){
                System.out.println(i + " * " + ScopeClass2.this.privateValue + " : " + (i*ScopeClass2.this.privateValue));
                
            }
            System.out.println("---------------");
            System.out.println("value of int the function : " + privateValue); 
            System.out.println("value of int the InternalClass : " + this.privateValue); 
            System.out.println("value of int the ScopeClass2 : " + ScopeClass2.this.privateValue); 

            
        }
        
    }
    
}
    

