
public class maincard {

private String model;
private String creater;
private int numberofhouse;
private String numberofoperations;   // işletimsistemi.

public maincard(String model,String creater,int numberofhouse,String numberofoperations){
    
this.model=model;
this.creater=creater;
this.numberofhouse=numberofhouse;
this.numberofoperations=numberofoperations;

}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public int getNumberofhouse() {
        return numberofhouse;
    }

    public void setNumberofhouse(int numberofhouse) {
        this.numberofhouse = numberofhouse;
    }

    public String getNumberofoperations() {
        return numberofoperations;
    }

    public void setNumberofoperations(String numberofoperations) {
        this.numberofoperations = numberofoperations;
    }
    
    
    
    public void uploadoperations(String operations)
    {
        this.numberofoperations=operations;
        System.out.println("operations system was upload." + numberofoperations);
        
    }

}

