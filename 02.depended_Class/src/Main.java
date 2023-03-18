// composition(birleştirme). ---> Instructor2un tek başına biir anlamı olmasaydı composition.
// aggregation.----> Instructor Course sınıfı olmadan da çalışabildiği için aggregation denir.

  public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("halil","Kaya","21425","Balıkesir",85);
		Student s2 = new Student("yusuf","Kaya","1315","Balıkesir",85);
		Student s3 = new Student (" Efe","Kaya","9890","Şanlıurfa",85);
		
		
Instructor teacher = new Instructor("İbrahim","kaya","CENG");
		
    
    // course has a Instructor.
	Course mat = new Course("Matematics","MAT",teacher);

	Student[] stu= {s1,s2,s3};
	
	
System.out.println("average: " + mat.calculateAverage(stu));


System.out.println("---------------------------");

System.out.println(mat.getInstructor().getName());

	}
	
	
}
