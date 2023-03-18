package first_java_project;

// memur.
//shift mesai.
//part= bölüm için.		


public class Officer extends Employee{

	private String part;   
	private String shift;                    
	
	public Officer(String name,String phone,String email,String part,String shift) {
		
		super(name,phone,email);
		
		this.part=part;
		this.shift=shift;
	}
	

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	
	public void work() {
		System.out.println("the officer " + getName() + "is starting work.");
	}
	
	public void enter() {
		System.out.println("Officer entered on C door.");
	}
	
}
