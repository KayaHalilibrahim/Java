
public class main {
   
    public static void main(String[] args) {
        
      //  subscriber sub = new subscriber();  // biz constructor kullannmadık javanın kendi constructoru.
        Ad_subscriber sub2 =new Ad_subscriber("halil", 200, "balıkesir");
        
        
  /* sub.name="yusuf";
   sub.balance=200;
   sub.city="Şanlıurfa"; */
   
sub2.learnbalance(); // kullanıcı istediği miktarı giremez.
    }
    
}
