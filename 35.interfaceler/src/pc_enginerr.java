
//Ienginerdeki verileri kendine göre tanımlıyor

public class pc_enginerr implements Iengineer{

    private boolean military;
    private boolean record;    // sicil

    
    
    
    public pc_enginerr(boolean military, boolean record) {
        this.military = military;
        this.record = record;
    }
      
    
    
    @Override
    public void about_military() {
  
        if(military){
            System.out.println("I did military service.");
        }
        else
        {
            System.out.println("I have not done my military service yet.");
        }
  
    }

    @Override
    public String graduation_average( double degree) {
        return "average"  +  degree; 
        
        
    }

    @Override
    public void criminal_record() {

        if(record){
            System.out.println("you have a criminal record.");
        }
        else 
        {
            System.out.println("you do not have any criminal record.");
        }
        
    }

    @Override
    public void job_experience(String[] array) {
           
        System.out.println("I worked in these companies as a computer engineer:");
        
        for(int i=0; i<array.length; i++){
             
            System.out.println(array[i]);
        }
        
    }
  
    
    
    
}
