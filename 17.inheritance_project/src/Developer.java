
public class Developer extends Employee{
    
    private String languages;
    
    public Developer(String name, String lastname,int number,String lang){
        
        
      super(name, lastname, number);
        
      
      this.languages=lang;
      
    }
    public void formatname(String OS)   // OS işletim sistemi
    {
        System.out.println(getName() + " " + OS +" uploaded");
    }
    
    public void showinfo( String language)
    {
        super.showinfo();
        System.out.println("know languages: " + languages);
        
    }
    
    
    
    
    // **********************
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    // **************************
    
}
