
public class factoryofbeyblade {
    
    public beyblade producebeyblade(String typebeyblade){
    
    if(typebeyblade.equals("Dragon"))
    {
        return new Dragon("Takao",800,300,"blue dragon","talk the holy beast");
    }
    
    else if(typebeyblade.equals("Dranza")){
        
        return new Dranza("Kai",600,400,"red phoennix");  // kırmızı anka kuşu.
    }
    
    else if(typebeyblade.equals("Dragia")){
        
        return new Dranza("Rei",800,250,"white tiger");  
    }
    
    else if(typebeyblade.equals("Draciel")){
        
        return new Dranza("Max",400,1000,"black tortoise");     // kaplumbağa
    }
    
    else
    {
       return null; 
    }
    
    
    
    }
}
