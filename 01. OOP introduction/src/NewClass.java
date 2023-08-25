
public class NewClass {
    
     public static void main(String[] args) {  
         
         trying mercedes= new trying();      // trying class'ın adı
         NewClass1 human =new NewClass1();   // NewClass1 class'ın adı.
         trying ford= new trying();
         
         
         
         human.job="engineer";
         human.name="halil";
         human.age=20;
         
         mercedes.colour="black";
         mercedes.model=2020;
         
         ford.colour="blue";
         ford.model=2021;
         
       
         System.out.println("your name: " + human.name);
         System.out.println("your job: " + human.job);
         System.out.println("your age. " + human.age);
         System.out.println("car's colour: " + mercedes.colour);
         System.out.println("car's model: " + mercedes.model);
         System.out.println("car's colour: " + ford.colour);
         System.out.println("car's model: " + ford.model);
         
         
     }
}
