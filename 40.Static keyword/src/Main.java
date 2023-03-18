// static ile yazarsak özellikler ve metodlar objeye bağlı değil, sınıfa ve metoda bağlı oluyor.
//Bu özellikleri kullanmak için obje oluşturmamıza gerek yok.
// bellekte direk oluşurlar.
// sınıfa ait olduları için sadece bir defa oluşur.

public class Main {

    public static void main(String[] args) {  // belllekte direk oluşması için static kullanıyoruz.
     
    Audience audience1= new Audience("Halil İbrahim Kaya");
    Audience audience2= new Audience("Yusuf Efe Kaya");
        
    audience1.watch_game();
    
        System.out.println("number of audience: " +  Audience.getNumber_of_audience());
    // class' a bağlı olduğu için hata vermedi.
    
    System.out.println("number of audience: " +  audience1.getNumber_of_audience());
    System.out.println("number of audience: " +  audience2.getNumber_of_audience());

    
        System.out.println(Math.PI);  // Math kütüphanesinde static olarak oluşmuş.
    
    }
    
}
