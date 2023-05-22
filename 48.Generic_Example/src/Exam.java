
public abstract class Exam {
    private int turkish;
    private int math;
    private int literature;
    private int physics;
    private String name;
    
    Exam(int turkish,int math,int literature,int physics,String name){
        this.turkish= turkish;
        this.math=math;
        this.literature=literature;
        this.physics=physics;
        this.name= name;
     
   }

    public int getTurkish() {
        return turkish;
    }

    public void setTurkish(int turkish) {
        this.turkish = turkish;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract int calculatePoint();
    
    
    
}