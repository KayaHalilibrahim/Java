//price= tutar.
//expiry date = son kullanma tarihi.
//payment = ödeme.
// 47 'de this yazmasakta çalışır.

public class Bank_A implements IBank,Itrying{

	private String Bank_Name;
	private String terminal_ID;
	private String pasword;
	
	public Bank_A(String bank_Name, String terminal_ID, String pasword) {
		super();
		Bank_Name = bank_Name;
		this.terminal_ID = terminal_ID;
		this.pasword = pasword;
	}

	
	public String getBank_Name() {
		return Bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}

	public String getTerminal_ID() {
		return terminal_ID;
	}

	public void setTerminal_ID(String terminal_ID) {
		this.terminal_ID = terminal_ID;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
	@Override
	public boolean connect(String IpAdress) {  // bankaya bağlantı.
		
		System.out.println("the user IP : " + IpAdress);
		System.out.println("The machine IP : " + this.hostIpadress);
		System.out.println(this.Bank_Name + " is connected");
		
		return true;
	}
	
	@Override
	public boolean payment(double price,String number,String expiryDate,String cvc) {
		
		System.out.println("the answer is awaited from Bank.");
		System.out.println("the procces is succesfull.");
		return true;
		
		
	}
	
	
}
