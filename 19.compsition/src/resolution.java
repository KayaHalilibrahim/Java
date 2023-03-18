
public class resolution {
    
    private int width;   // en
    
    private int length;  // boy
    
    private String weight;

    public resolution(int widt, int leng,String kg) {
        this.width = widt;
        this.length = leng;
        this.weight=kg;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    
}
