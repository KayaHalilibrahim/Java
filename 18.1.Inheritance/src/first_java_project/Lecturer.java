package first_java_project;



public class Lecturer extends Acamedician{

	private int doorNo;
	
	public Lecturer(String name,String phone,String email,String department,String title,int doorNo) {
	
	super(name,phone,email,department,title);
	
	this.doorNo=doorNo;
	
  }
	
	public int getDoorNo() {
		
		return doorNo;
	}
	
	public void setDoorNo(int doorNo) {
		
		this.doorNo=doorNo;
	}
	
	
		public void enter() {
			System.out.println("the lecturer entered on B door..");
		} 
	
}