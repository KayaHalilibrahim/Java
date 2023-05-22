
package genericclass;


class Student {
    private String name;
    private int number;
    
    public Student(String name,int number){
        this.name= name;
        this.number= number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

  
@Override
    public String toString() {
        return "number :  " + number;
    }    
}