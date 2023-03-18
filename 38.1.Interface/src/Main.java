import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter amount : ");
		double amount= scan.nextDouble();
		scan.nextLine();
		System.out.print("enter card no : ");
		String card_no= scan.nextLine();
		System.out.print("enter expiry date : ");
		String expiry_date= scan.nextLine();
		System.out.println("enter the cvc : ");
		String cvc = scan.nextLine();
		
		
		String Bank="1.Bank_A\n"+"2.Bank_B\n"+"3.Bank_C\n";
		
		System.out.println(Bank);
		
		System.out.println("which Bank do you want withdraw money : ");
		int choose=scan.nextInt();
		
		switch(choose) {
		
		case 1: Bank_A  a1 = new Bank_A("Bank A","0258147369","123456");
		
		a1.connect("11230.5.2");
		a1.payment(amount, card_no, expiry_date, cvc);
		break;
		 
		case 2: Bank_B  b1 = new Bank_B("Bank B","0258147369","123456");
		b1.connect("51313.3.12");
		b1.payment(amount, card_no, expiry_date, cvc);
		break;
		}
	}
	
}
