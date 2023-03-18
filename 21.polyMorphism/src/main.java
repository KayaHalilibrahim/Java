//************** polymorphism= çook biçimcilik **************


class animal{                // main class
    private String name;
    
    public animal(String name)
    {
        this.name=name;
    }
 
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    
    public String talk()
    {
        return "the animal is talking";
    }
    
    
}

// *********************************************

class cat extends animal
{
public cat(String name){

super(name);


 
  }

    @Override
    public String talk() {
        return this.getName() + " is meoving";
    }
}

// *******************************************

class dog extends animal{
    
    public dog(String name){
        
        super(name);
    }
    
    public String talk()
    {
        return getName() + " is barking";  // havlamak
     }
}

//**********************************

class horse extends animal{

     public horse(String name) {
         super(name);
     }
     
     public String talk(){
         return this.getName() + " neighing.";   // kişnemek
     }
    
}




public class main {
    
    public static void main(String[] args) {
         
        animal D =new animal("parrot");
        animal A =new dog("Black");
        animal B =new cat("tom");
        animal C =new horse("champion");
        
        
        System.out.println(D.talk());
        System.out.println(A.talk());
        System.out.println(B.talk());
        System.out.println(C.talk());
    }
    
}
