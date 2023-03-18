
public abstract class Acamedician extends Employee {
	
	// bu sınıftan obje oluşturmayız.
	// metodları abstract yapmazsak kullanabiliriz.
	
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
 // eğer bu metodu abstract yapmazsak normal kullanabiliriz.
    
    
    
    
    public void enter() {
    	System.out.println("the acammedician entered on A door.");
    }
    
    public void out() {
    	
    	System.out.println("the lecturer left the university");
    }
    
    
}
