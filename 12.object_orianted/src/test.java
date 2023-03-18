


public class test {
     public static void main(String[] args){
         
         car car1= new car();  // araba objesi oluştu...
         
         car1.colour="blue";  // eğer private olsaydı hata  verirdi
         car1.door=4;
         car1.wheels=4;
         car1.engine="16v";
         car1.model="ford";
         
         System.out.println("car's colour: " + car1.colour);
         System.out.println("car's door: " + car1.door);
         System.out.println("car's wheels: " + car1.wheels);
         System.out.println("car's.engine: " + car1.engine);
         System.out.println("car's model: " + car1.model);
     }
    
}
