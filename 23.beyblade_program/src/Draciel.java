
public class Draciel extends beyblade  {
    
    private String holybeast;
    
    public Draciel(String beyblade,int backspeed,int attack_power,String holybeast){
        
        super(beyblade, backspeed, attack_power);
        this.holybeast=holybeast;
        
    }
    
     public void showinfo(){
         
        super.showinfo();
        System.out.println("name of hoolly beats: " + holybeast);
     }
  
      public void monster(){
          System.out.println(getBeyblade() +" reveals the " + holybeast);
          
      }     
    
    
    
}
