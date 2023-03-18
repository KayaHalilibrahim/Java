
public class Dragon extends beyblade {

   private String holybeast;
    private String hidden_talent;
    
public Dragon(String beyblade,int backspeed,int attack_power,String holybeast,String hidden_talent){

    super(beyblade, backspeed, attack_power);
    this.holybeast=holybeast;
    this.hidden_talent=hidden_talent;
}    
 public void showinfo(){
         
        super.showinfo();
        System.out.println("name of hoolly beats: " + holybeast);
        System.out.println("hidden talent: " + hidden_talent);
     }
  
      public void monster(){
          System.out.println(getBeyblade() +" reveals the " + holybeast);
          
      }     
    
}
