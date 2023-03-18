
//  *************composition************
// HAS - A ilişkisi var yani sahiplik.
// bilgisayar diğer nesnelere sahiptir.
// inheritance kullanammayız çünkü bunlar parça gibidir.



public class test {
    
    public static void main(String[] args) {
        
        resolution  r1= new resolution(1920, 1080,"5");
        
        monitor   m1= new monitor("VS197De", "ASUS", "18.5", r1);  // r1'i  m1'in bir parçası olarak düşünebliriz. 
        
        desk  d1= new desk("shadow blade","shadow", "tampered glass");
        
        maincard c1 =new maincard("8250-pro", "asus", 10, "winfows 10");
        
        
        computer pc =new computer(m1, d1, c1);
        
        
        
        pc.getD1().opencomputer();  // bilgisayar objesindeki kasa (d1) referansını alır.
        
        pc.getMon1().closecomputer();
        
        pc.getMcard().uploadoperations("obuntu 16.04");
        
        System.out.println(pc.getD1().getModel());
        
    }
    
}
