// interfaceler abstract gibidir.
// final -- değiştirilmeyecek değişken tanımlayabiliyoruz.
// değişken tanımlarsak varsayılan değerini girmeliyiz.
//public yazabiliriz private olmaz.
// bir sınıf birden fazla interface'yi implement edebilir.


public interface IBank {
	  
	 final String hostIpadress= "1323";
	
	 boolean connect(String IPadress);
	 
     boolean payment(double price,String number,String expiryDate,String cvc);
     
}
