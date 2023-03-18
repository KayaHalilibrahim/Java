
public class cons {
    
    private String name;
    private String surname;
    private int number;
    
    
    
    public cons(String name,int number)
    {
        this.name=name;
        this.number=number;
        this.surname=surname;
    }
    public cons(String name,String surname,int number)
    {
         this.name=name;
        this.number=number;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
