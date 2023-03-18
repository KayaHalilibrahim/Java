package first_java_project;

public class Acamedician extends Employee{
	
	private String department;
	private String title;
	
	public Acamedician(String name,String phone,String email,String department,String title) {
		
		super(name,phone,email);
		
		this.department= department;
		this.title=title;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {    // title=unvan. 
		this.title = title;
	}
	
	
	//-------------------------
	
    public void go_Lecture() {
    	System.out.println("the "+ this.getName() + " entered lecture.");
    	
  }
    
    
    public void enter() {
    	System.out.println("the acammedician entered on A door.");
    }
    
    
}
