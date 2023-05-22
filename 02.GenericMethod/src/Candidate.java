//Candidate = Aday

public  abstract class Candidate {
    private int Turkish;
    private int math;
    private int literature;
    private int physics;
    public Candidate(int Turkish, int math, int literature, int physics) {
        this.Turkish = Turkish;
        this.math = math;
        this.literature = literature;
        this.physics = physics;
    }

    public int getTurkish() {
        return Turkish;
    }

    public void setTurkish(int Turkish) {
        this.Turkish = Turkish;
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
    
    abstract int calculatePoints();

    
}
