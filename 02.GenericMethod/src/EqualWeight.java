//EqualWeight = Eşit Ağırlık
public class EqualWeight extends Candidate{
    
   public EqualWeight(int Turkish, int math, int literature, int physics) {
        super(Turkish, math, literature, physics);
    }
    
        @Override
    public int calculatePoints() {
        return getTurkish()*5 + getMath()*5+getPhysics()*1+getLiterature()*4;
    }
    
}
