
 // erişimi engellemek için private kullanırız.(encapsullation).


public class car {
    
   private String colour;
   private int door;
  private String model ;
    
   
   
   // refactor ile yapıldı
   
   
    public String getColour() {
        return colour;
    }

    
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoor() {
        return door;
    }

   
    public void setDoor(int door) {
        if(door<0)
        {
            System.out.println("door number can not be under the zero");
        }
        else
        {
            this.door=door;
        }
    }

    public void setmodel(String model)
    {
        this.model= model;
    }
    public String getmodel()
    {
        return model;
    }
    
    
    
}


