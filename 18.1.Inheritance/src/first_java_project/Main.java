package first_java_project;
// computing= bilgi işlem.

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp= new Employee("Halil İbrahim Kaya","0546735","halil.ky@gmail.com");

    System.out.println(emp.getName()+ " \n"+emp.getEmail()+" \n"+emp.getPhone());
	
    emp.enter();
    
    System.out.println("---------------------------------");
    
    Acamedician a1 = new Acamedician("Yusuf Kaya","0551546","mustaf@gmail.com","CENG","Prof. Doctor");
    
    a1.enter();
    a1.go_Lecture();
    
    System.out.println("---------------------------------");

    Employee m1= new Officer("Murat"," 0651232","Murat.@gmail.com","computing","09.00-18.00");
 
    // Officer sınıfına ait özellikleri kullanamayız.
    
    		m1.refectory();
    
    System.out.println("---------------------------------");

    Officer m2= new Officer("Enes "," 0553","ens.ky@gmail.com","Computing","08.00-17.00");
    		
    m2.work();
    m2.out();
    
    System.out.println("---------------------------------");

Lecturer lecturer1= new Lecturer("Efe","054236","efe@gmail.com","CENG","prof.Doctor",12);    
    
lecturer1.setName("Mustafa");

System.out.println(lecturer1.getDoorNo());   //lecturer class
lecturer1.enter();                           //Employee class
lecturer1.go_Lecture();                      //Acamedician class  

System.out.println("---------------------------------");
System.out.println("---------------------------------");
System.out.println("---------------------------------");

emp.enter();
a1.enter();   // polmorphism
m1.enter();
m2.enter();
lecturer1.enter();

//normalde m1 nesnesi için sınıfın metodlarına ulaşamıyoruz ama override olan metodlara ulaşabiliyoruz.
//override olmayna metodlara ulaşamıyoruz.

System.out.println("---------------------------------");
System.out.println("---------------------------------");
System.out.println("---------------------------------");

Employee[] login= {emp,a1,m1,m2,lecturer1}; 

Employee.loginUser(login);  // static olduğu için hata vermedi.



}
}