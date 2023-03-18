
public class beyblade {
    
    private String beyblade;
    private int  backspeed;
    private int attack_power;

    public beyblade(String beyblade, int backspeed, int attack_power) {
        this.beyblade = beyblade;
        this.backspeed = backspeed;
        this.attack_power = attack_power;
    }
    
    //***********************************************

    public String getBeyblade() {
        return beyblade;
    }

    public void setBeyblade(String beyblade) {
        this.beyblade = beyblade;
    }

    public int getBackspeed() {
        return backspeed;
    }

    public void setBackspeed(int backspeed) {
        this.backspeed = backspeed;
    }

    public int getAttack_power() {
        return attack_power;
    }

    public void setAttack_power(int attack_power) {
        this.attack_power = attack_power;
    }
    
    //*****************************************
    
    public void attack()
    {
        System.out.println(beyblade + " is attacking with " + attack_power +  " and " + backspeed );
    }

public void monster(){
    System.out.println("this bayblade does not have monster");
}

public void showinfo()
{
    System.out.println("name of bayblade: " + beyblade );
    System.out.println("power of attactk: " +attack_power);
    System.out.println("speed of ppower: " + backspeed);
}


    
}
