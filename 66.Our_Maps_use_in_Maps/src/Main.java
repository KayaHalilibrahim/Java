
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}

public class Main {
    
    public static void main(String[] args) {
        
        Player player1 = new Player("halil", 10);
        Player player2 = new Player("Enes", 20);
        Player player3 = new Player("Mustafa", 30);
        Player player4 = new Player("halil", 10);

        // iki değerde depolanır. Kendi oluşturduğumuz kodda (equals ve HashCode Override edip kullanmazsak java bunların aynı olacağını anlayamaz).
        // Eğer HashCode  ve Equals metodlarını override yaparsak aynı değer iki defa yazılmaz.
        
        Set<Player> hashSet = new HashSet<>();
        
        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for (Player p : hashSet){
            System.out.println(p);
        }        

    }
}
