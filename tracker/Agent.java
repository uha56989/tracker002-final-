import java.util.ArrayList;

import javax.swing.JOptionPane;


public abstract class Agent{
    private int kill,death,assistance,win,lose;
    private double DR; //damage per round
    private String result;
    //ArrayList<Agent> ag = new ArrayList<Agent>();

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
    public void setResult(String r){
        result = r;
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
    public String getResult(){
        return result;
    }
    public double ComputeWinRate(){
        return win/lose;
    }
    public double ComputeKD(){
        return kill/death;
    }
    public abstract String getInfo(); 
    public abstract String getAgentName();
    public boolean WoL(){
        if(result.equalsIgnoreCase("w")){
            setWin(getWin()+1);
            return true;
        }
        else if(result.equalsIgnoreCase("l")){
            setLose(getLose()+1);
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null,"請輸入w(win)或l(lose)");
            return false;
        }
    }
}