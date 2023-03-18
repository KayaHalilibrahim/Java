
public class machine_engineer implements Iengineer,Iworking {

    
    private boolean military;
    private boolean record;
    
    public machine_engineer(boolean military,boolean record)
    {
        this.military=military;
        this.record=record;
        
    }    

    //---------------------------------
    
    @Override
    public void work() {
       
        System.out.println("the machine engineer is working.");
        
    }
    
    //----------------------------------
    
    @Override
    public void about_military() {
        
        if(military)
        {
            System.out.println("I did military service.");
        }
        else
        {
            System.out.println("I have not done my military service yet.");
        }
        
    }

    @Override
    public String graduation_average(double degree) {
        
                return "average"  +  degree;    }

    @Override
    public void criminal_record() {
        
        if(record)
        {
            System.out.println("you have a criminal record.");
        }
        else 
        {
            System.out.println("you do not have any criminal record.");
        }
        
    }

    @Override
    public void job_experience(String[] array) {
        
        if(array.length==0){
            System.out.println("there is no anything experience.");
        }
        else 
        {
            System.out.println("I worked in these companies as a machine engineer:");
        }
        
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        
    }
    
    public void bring_referance(String[] array2)
    {
        if(array2.length == 0){
            System.out.println("There is no anything referance");
        }
        else
        {
            System.out.println("my referances: ");
            
            for(int i=0; i<array2.length; i++)
            {
                System.out.println(array2[i]);
            }
        }
    }
    
    
    
    
}
