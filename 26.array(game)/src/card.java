
public class card {
    
    private char value;
    private boolean guees=false; // oyunun başında hiç bir kart tahmin edilmediği için.

    
    
    public card(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isGuees() {
        return guees;
    }

    public void setGuees(boolean guees) {
        this.guees = guees;
    }
    
    
    
    
}
