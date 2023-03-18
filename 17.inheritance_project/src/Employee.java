
public class Employee {
    
    private String name;
    private String surname;
    private int no;

    public Employee(String name, String surname, int no) {
        this.name = name;
        this.surname = surname;
        this.no = no;
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

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    
   
    
    
    public void showinfo()
    {
        
        System.out.println("***********information the employee*******\n");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("ID no: " + no);
    }
    
    
    
    
}
