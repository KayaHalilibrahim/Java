
import java.util.Scanner;


public class Vector {
    
    private String name;
    private int i;
    private int j;
    private int k;
    
    public Vector(String name){
        
        this.name=name;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("please enter value of the i,j,k: ");
       
        System.out.print("value of the i: ");
        this.i=scan.nextInt();
        
        System.out.print("value of the j: ");
        this.j=scan.nextInt();
        
        System.out.print("value of the k: ");
        this.k=scan.nextInt();
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
    
    
}
