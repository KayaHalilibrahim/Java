
public class desk {  // kasa
    
    private String model;
    private String creater;
    private String material;

    public desk(String model, String creater, String material) {
        this.model = model;
        this.creater = creater;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    public void opencomputer()
    {
        System.out.println("the computer is openning.");
    }
    
}
