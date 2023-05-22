

public class Grup_B extends Exam{
    
    public Grup_B(int turkish, int math, int literature, int physics, String name) {
        super(turkish, math, literature, physics, name);
    }
    
    
      @Override
     public int calculatePoint(){
        return getTurkish()*5 + getMath()*5+ getLiterature()*4 + getPhysics()*1;
    }
    
    
}
