
public class Grup_A extends Exam{
    
    public Grup_A(int turkish, int math, int literature, int physics, String name) {
        super(turkish, math, literature, physics, name);
    }
    
      @Override
     public int calculatePoint(){
        return   getTurkish()*5 + getMath()*5+ getLiterature()*1 + getPhysics()*4;
    }
    
}
