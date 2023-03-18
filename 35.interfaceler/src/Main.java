
// çoklu kalıtım görevi yapmak için interface kullanılır.
// bir class birden fazla interfaceyi implemented edebiliyor.  


public class Main {

public static void main(String[] args){
    
//    Iengineer engineer1= new Iengineer();  hata oluyor çünkü interfaceler obje oluşturamaz.
    
pc_enginerr engineer1= new pc_enginerr(false, false);   // Iengineer engineer= yazsaydık olurdu.
    
engineer1.about_military();
engineer1.criminal_record();


    System.out.println(engineer1.graduation_average(3.70));

    String[] array = {"Vestel","Havelsan","Turksat"};

    engineer1.job_experience(array);

    System.out.println("--------------------------------");
    
machine_engineer mac_engineer =new machine_engineer(true, false);


String[] exp = {};
String[] referance={"halil ibrahim kaya","yusuf efe kaya"};

mac_engineer.criminal_record();
mac_engineer.about_military();
mac_engineer.criminal_record();

    System.out.println(mac_engineer.graduation_average(2.65));

    mac_engineer.job_experience(exp);
    mac_engineer.bring_referance(referance);
    
    System.out.println("----------------");
    
    mac_engineer.work();

  }
}