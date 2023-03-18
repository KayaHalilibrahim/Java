
public class Main {
	
	public static void main(String[] args) {
		
	//Employee emp = new Employee("halil","05651","kaya@gmail.com");
	// abstract olduğu için obje oluşturamayız.
		
		
	//Acamedician aca = new Acamedician("Mustafa","2655313","x","y","z");
	// abstract olduğu için obje oluşturamayız.
	
	//Officer m1 = new Officer(...)
	// abstract olduğu için obje oluşturamayız.
	
	Lecturer lec = new Lecturer("Mustafa","2655313","x","y","z",25);

	lec.go_Lecture();
	lec.out();
	
	}
}