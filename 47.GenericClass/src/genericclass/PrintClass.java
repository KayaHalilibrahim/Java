package genericclass;

public class PrintClass <T>  {
    
    public void print( T[] array ){
        for(T t : array){
            System.out.println(t);
        }
    }
}
