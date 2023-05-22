//digital = sayısal.

public class Digital extends Candidate{

    public Digital(int Turkish, int math, int literature, int physics) {
        super(Turkish, math, literature, physics);
    }
    
    @Override
    public int calculatePoints() {
        return getTurkish()*5 + getMath()*5+getPhysics()*4+getLiterature()*1;
    }
    
}
