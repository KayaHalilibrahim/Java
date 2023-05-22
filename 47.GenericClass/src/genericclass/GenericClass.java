
package genericclass;

// türden bağımsız işlem yapabildiğimiz sınıflarlardır.


public class GenericClass {
    
    public static void main(String[] args) {
    
Character[] characterArray = {'J','a','v','a'};

Integer[] integerArray= {1,2,3,4,5,6,7};

String [] stringArray= {"Java","Python","C++","Php"};

Student [] studentArray = { new Student("Ahmet",1) , new Student("Mehmet",2), new Student("Merve",3)};

/*
PrintChar.print(characterArray);
        System.out.println("---------------------------");
PrintInteger.print(integerArray);
        System.out.println("---------------------------");
PrintString.print(stringArray);
        System.out.println("---------------------------");
PrintStudent.print(studentArray);
*/

PrintClass<Character> printChar = new PrintClass<>();
PrintClass<String> printString = new PrintClass<>();
PrintClass<Integer> printInteger = new PrintClass<>();
PrintClass<Student> printStudent = new PrintClass<>();


printChar.print(characterArray);
        System.out.println("---------------------------");
printString.print(stringArray);
        System.out.println("---------------------------");
printInteger.print(integerArray);
        System.out.println("---------------------------");
printStudent.print(studentArray);

        
    }
    
}
