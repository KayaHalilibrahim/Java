// String üzerinde 3 işlem yapabşlmek için Comparator kullanılır.
//compareTo metodu küçükten büyüğe sıralar eğer büyükten küçüğe sıralamak istersek fonksiyonu ters çevirmek lazım.
//o1.compareTo(o2); küçükten büyüğe sıralar.
//-o1.compareTo(o2); büyükten küçüğe sıralar.

import java.util.*;

class SortName implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
     return o1.getName().compareTo(o2.getName());
    }
    
}




class BigToSmallString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
       return -o1.compareTo(o2);   // o1 > o2 -> +1  // o1 <02 -> -1  // o1 = 02 -> 0
    }
    
}

class SmallToBigPlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
       if(o1.getId() > o2.getId()){
           return 15;
    }
       else if(o1.getId()< o2.getId()){
           return -15;
       }
      return 0;  // equal.
    }
}


class Player{
   private  int id;
   private  String name;
    
    public Player(String name,int id ){
        this.id=id;
        this.name =name;
    }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    
    
    
    @Override
    public String toString() {
         return "| | | | ID : " + id + " Name : " +name;
    }
    }



        public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("*************big to small(alphabetical)*******************");
     List<String> list = new ArrayList<>();
       
       list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");
        
        Collections.sort(list,new BigToSmallString());   // alfabetik olarak sıralar.

        for(String s : list){
            System.out.println(s);
        }

     
        System.out.println("*************small to bigger(id)*******************");
        
         List<Player> listPlayer = new ArrayList<>();
    
    listPlayer.add(new Player("Halil", 5));
    listPlayer.add(new Player("ibrahim", 2));
    listPlayer.add(new Player("Mustafa", 4));
    listPlayer.add(new Player("Enes", 1));
    
    
   Collections.sort(listPlayer,new SmallToBigPlayer());  // id'lere göre sıralayacak.
   
   for(Player p : listPlayer){
       
       System.out.println(p);
    
}
   
          System.out.println("\n**************Name(String)******************");
          
          Collections.sort(listPlayer,new SortName());
          
             for(Player n : listPlayer){
       
       System.out.println(n);
    
}
             
             
                       System.out.println("\n**************inner class******************");

                       Collections.sort(listPlayer, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getName().compareTo(o2.getName());
            }
                       } );

             for(Player x : listPlayer){   // tersten yazdırdı.
                 System.out.println(x);
             }
                       
    }
}


