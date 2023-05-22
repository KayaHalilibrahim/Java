public class GenericMethod {


    public static void main(String[] args) {
            
/*
Character[] characterArray = {'J','a','v','a'};

Integer[] integerArray= {1,2,3,4,5,6,7};

String [] stringArray= {"Java","Python","C++","Php"};

Student [] studentArray = { new Student("Ahmet") , new Student("Mehmet"), new Student("Merve")};
        
        print(characterArray);
        print(integerArray);
        print(stringArray);
        print(studentArray);
*/
                
Digital digital1 = new Digital(30, 40, 20, 30);
Digital digital2 = new Digital(25, 35, 10, 25);

Digital first = first(digital1, digital2);
        System.out.println("Point of the first student(Digital): " + first.calculatePoints());


EqualWeight equalWeight1 = new EqualWeight(30, 20, 40, 10);
EqualWeight equalWeight2 = new EqualWeight(25, 15, 35, 5);
EqualWeight first2= first(equalWeight1,equalWeight2);
         System.out.println("Point of the first student(EqualWeight): " + first2.calculatePoints());


    }
    /*
    public static <T> void print(T[] array){
        
        for(T t : array){
            System.out.println(t);
        }
    
*/
    
    
    public static <T extends Candidate>T  first(T t1 ,T t2){
        if(t1.calculatePoints() > t2.calculatePoints()){
            return t1;
        }
        else{
            return t2;
        }
    }
    
}
