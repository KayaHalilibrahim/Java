
public class Problem {
    
    
    public static class Mathematics{
        
        public static void cirle(int  radius){
            
            System.out.println("field of the circle " + (Math.PI*radius*radius));
        }
        public static void perimeter_triangular(int edge1,int edge2,int edge3){
            
            System.out.println("perimeter of triangular: " + (edge1+edge2+edge3));
             
        }
        
        
        
    }
    
    public static class physic{      // iç çarpım.
        
      public static void Inner_produce(Vector vec1,Vector vec2){
          
          
          int inner_produce=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
          
          System.out.println("inner produce between  " + vec1.getName()+vec2.getName()+ " : " + inner_produce);
          
          
      }       
        
        
        
        
        
    }
    
    
}
