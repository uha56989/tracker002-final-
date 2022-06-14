public abstract class Map {
    private int kill,death,assistance,win,lose;
    private double DR; //damage per round

    public void setKill(int k){
        kill = k;
    }  
    public void setDeath(int d){
        death = d;
    }
    public void setAssistance(int a){
        assistance = a;
    }
    public void setDR(double dr){
        DR = dr;
    }
    public void setWin(int w){
        win = w;
    }
    public void setLose(int l){
        lose = l;
    }
    public int getKill(){
        return kill;
    }
    public int getDeath(){
        return death;
    }
    public int getAssistance(){
        return assistance;
    }
    public double getDR(){
        return DR;
    }
    public int getWin(){
        return win;
    }
    public int getLose(){
        return lose;
    }
    public double ComputeWinRate(){
        return win/lose;
    }
    public double ComputeKD(){
        return kill/death;
    }
    public abstract String getInfo(); 
}
