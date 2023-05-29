// x.compareTo(y) dersek this olan x olur.
// kendi sıralamamızı yapmak için compareTo kullanılır.

import java.util.*;


class Player {
    private String name;
    private int id;
    
    public Player(String name, int id){
    this.name=name;
    this.id=id;
}

    @Override
    public String toString() {
          return "| | | | ID : " + id + " Name : " +name;
    }
}



public class Main {
    
    public static void main(String[] args) {
        
    /*    List<String> list = new ArrayList<>();
        
       
       list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");
        
        Collections.sort(list);   // alfabetik olarak sıralar.

        for(String s : list){
            System.out.println(s);
        }
     */
    
 /*   List<Player> listPlayer = new ArrayList<>();
    
    listPlayer.add(new Player("Halil", 5));
    listPlayer.add(new Player("ibrahim", 2));
    listPlayer.add(new Player("Mustafa", 4));
    listPlayer.add(new Player("Enes", 1));
    
    
   Collections.sort(listPlayer);  // id'lere göre sıralayacak.
   
   for(Player p : listPlayer){
       
       System.out.println(p);
   }
*/
   
        System.out.println("-----------------------------------"
                          +  "\n************************** ");
    
        Set<Player> treeSet = new TreeSet<>();
        
    treeSet.add(new Player("Halil", 5));
    treeSet.add(new Player("ibrahim", 2));
    treeSet.add(new Player("Enes", 1));
    treeSet.add(new Player("Mustafa", 8));
    
     for (Player m :  treeSet){    // TreeSet sınfın içindeki compareTo metodunu kullanarak sıralar.
        System.out.println(m);
    }
 
 
    }
}
