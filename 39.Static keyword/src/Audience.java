// audience= seyirci.


public class Audience {
    
    private String name;
    
    private static int number_of_audience=0;  // objeye değil sınıfa özgü oluyor.

    
    
    public Audience(String name) {
        this.name = name;
        
        number_of_audience++;  // oluşturulan her bir constructorda seyirci sayısı bir artıyor.
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public void watch_game(){
        
        System.out.println(name + " is watching game.");
        
    }

    public static int getNumber_of_audience() {
        return number_of_audience;
    }

    
 
    
    
    
    
    
}
