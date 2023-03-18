
public class exercise {
    
    private int squat ;       //çömelmek
    private  int pushup;     // şınav
    private int situp;       // mekik

    public exercise(int sauat, int pushup, int situp) {
        this.squat = sauat;
        this.pushup = pushup;
        this.situp = situp;
    }

    public int getSauat() {
        return squat;
    }

    public void setSauat(int sauat) {
        this.squat = sauat;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushub) {
        this.pushup = pushub;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }
    
    public void move(String typeofmove,int number)
    {
        if(typeofmove.equals("squat")){
            
            makesquat(number);
            
        }
        else if(typeofmove.equals("pushup")){
         
            makepushup(number);
            
        }
        else if(typeofmove.equals("situp")){
            makesitup(number);
        }
        else
        {
            System.out.println("invalid move");
        }
            
    }


public void makesquat(int a){   // a=number
    
    if(squat==0)
    {
        System.out.println("there is no squat");
    }
    if(a>squat)
    {
        System.out.println("you are strong.succesfull");
        squat=0;
        System.out.println("remaining squat number: " + squat);
    }
    else 
    {
        squat-=a;
        
        System.out.println("there are " + squat +" you should continue.");
    }
    
}    
public void makepushup(int a){   // a=number
    
    if(pushup==0)
    {
        System.out.println("there is no pushup");
    }
    if(a>pushup)
    {
        System.out.println("you are strong.succesfull");
        pushup=0;
        System.out.println("remaining pushup number: " + pushup);
    }
    else 
    {
        pushup-=a;
        
        System.out.println("there are " + pushup +" you should continue.");
    }
    
}    
public void makesitup(int a){   // a=number
    
    if(situp==0)
    {
        System.out.println("there is no situp");
    }
    if(a>situp)
    {
        System.out.println("you are strong.succesfull");
        situp=0;
        System.out.println("remaining situp number. " + situp);
    }
    else 
    {
        situp-=a;
        
        System.out.println("there are " + situp +" you should continue.");
    }
    
}    
public boolean finishexercise()
        {
            return (squat==0) && (pushup==0) && (situp==0);
        }
    
}

