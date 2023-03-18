
public class main {
    
    public static void main(String[] args) {
        
        
        //cons person =new cons();
        
        cons person2= new cons("halil",1000);
        
        cons person3 =new cons("ibrahim", "kaya", 2000);
         
        cons person4 =new cons("ibrahim", "kaya", 2000);
        
        
        System.out.println(person4.getNumber());
        
        System.out.println(person2.getName());
        
        System.out.println(person3.getSurname());
    }
}
