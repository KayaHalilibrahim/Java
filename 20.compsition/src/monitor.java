


public class monitor {
    
    private String Model ;
    
    private String creater;
    
    private String length;
    
     private resolution res;  //  composition  res monitorun bir parçası

    public monitor(String Model, String creater, String length, resolution res) {
        this.Model = Model;
        this.creater = creater;
        this.length = length;
        this.res = res;
    }
    
   

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public resolution getRes() {
        return res;
    }

    public void setRes(resolution res) {
        this.res = res;
    }
    
    public void closecomputer()
    {
        System.out.println("close the computer");
    } 
    
}
