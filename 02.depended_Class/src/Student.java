
public class Student {

	private String name;
	private String surname;
	private String ID;
	private String adress;
	private int point;
	
	public Student (String name,String surname,String ID,String adress,int point) {
		
		this.name=name;
		this.surname=surname;
		this.ID = ID;
		this.adress=adress;
		this.point=point;
		
		
	}
	
	public String getName() {
		
    	return this.name;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getSurname() {
		
	   return this.surname;
	}
	public void getSurname(String surname) {
		
		this.surname=surname;
	}
	public String getID() {
		
		return this.ID;
		
	}
	public void setID(String ID) {
		this.ID=ID;
		
	}
	public String getAdress() {
		
		return this.adress;
	}
	public void setAdress(String adress) {
		
		this.adress=adress;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
	
		if (point>100 || point<100 ) {
		   	 
		   	 point=0;
		    }
		
    	 this.point=point;
	}
	
	
	
}
