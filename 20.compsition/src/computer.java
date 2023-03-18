
public class computer {
    
    private monitor mon1;
    private desk  d1;
    private maincard mcard;
    
    
    public computer(monitor mon,desk dd, maincard card){
        
        this.mon1=mon;
        this.d1=dd;
        this.mcard=card;
    }

    public monitor getMon1() {
        return mon1;
    }

    public void setMon1(monitor mon1) {
        this.mon1 = mon1;
    }

    public desk getD1() {
        return d1;
    }

    public void setD1(desk d1) {
        this.d1 = d1;
    }

    public maincard getMcard() {
        return mcard;
    }

    public void setMcard(maincard mcard) {
        this.mcard = mcard;
    }
    
    
    
    
}
