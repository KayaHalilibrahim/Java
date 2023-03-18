
public class User {
    
    private int Id;
    private String name;
    private int age;

    public User(int Id, String name, int age) {
        this.Id = Id;
        this.name = name;
        this.age = age;
    }

    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    
    
}
