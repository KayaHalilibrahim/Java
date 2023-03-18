
class B extends Ata{
    
    public B(String str)
    {    	
    	super("B'den "+str);
        
    System.out.println("B-str "+str);
    }
    public B()
       {    	
    	this(" default ");
    	System.out.println(" B-default ");
    	
       }
    }