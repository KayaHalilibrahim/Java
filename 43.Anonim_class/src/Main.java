// herhangi bir class tanımlama olmadan obje oluşturabiliyoruz.



public class Main {
    
    public static void main(String[] args) {
        
        
        Istudent student =new Istudent() {
           
            @Override
            public void study() {
                System.out.println("ı am studying.");
                
            }

            @Override
            public void attend_class() {
                System.out.println("ı am going to class. ");
            }
        };
        
        
        student.study();
        student.attend_class();
        
        
        System.out.println("--------------------------------");
        
        Astudent student2 = new Astudent("halil ibrahim kaya", 3500) {
            @Override
            void make_record() {
               
                System.out.println("the sign up is making"+ " name: " +getName()+ " no: "+ getNo());
              

            }
        };
        
        student2.make_record();
        student2.greet();
    }
    
    public static abstract class Astudent{
        private String name;
        private int no;

        public Astudent(String name, int no) {
            this.name = name;
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }
        
        
        
        
        
        abstract void make_record();
        
        public void greet() {   // selamla
           
            System.out.println("helloo");
        
        
     }
    }
    
    
    public interface Istudent{
        
        void study();
        void attend_class();
        
        
    }
    
}
