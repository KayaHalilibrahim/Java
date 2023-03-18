
public class Course {

	private String course_Name;
	private String code;
	private Instructor instructor;
	
	
	public Course(String course_Name,String code,Instructor instructor) {
		
		this.course_Name=course_Name;
		this.code=code;
		this.instructor=instructor;
		
	}
	
	public String getCourse_Name() {
		
		return this.course_Name;
	}
	public void setCourse_Name(String course_name) {
		
		this.course_Name=course_name;
	}
	public String getCode() {
		
		return this.code;	
	}
	public void setCode(String code) {
		
		this.code=code;
	}
	

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	
	public double calculateAverage(Student[] students) {
		
		double average=0.0;
		
		for(Student student : students) {
			
			average+=student.getPoint();
			
		}
		
		return average/students.length;
		
	}
	
	
}
