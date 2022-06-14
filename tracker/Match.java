
import javax.swing.JOptionPane;
//import java.util.ArrayList;
import java.time.LocalDateTime;

public class Match {
    private int match_win,match_lose,total_kill,total_death,total_assistance,total_DR;
    private int match_number;

 
    private double KD,DR;
    private String map,time;
    private int kill,death,assistance,win_roumd,lose_round;
    private String result,agent_name;


    public Match(Agent a,String m,int mn){
        setAgent(a);
        setMap(m);
        setTime();
        setMN(mn);

        kill=a.getKill();
        death=a.getDeath();
        assistance=a.getAssistance();
        result=a.getResult();
        agent_name=a.getAgentName();
        DR= a.getDR();
        
        
    }
    public void setAgent(Agent a){
        total_kill+=a.getKill();
        total_death+=a.getDeath();
        total_assistance+=a.getAssistance();
        total_DR+=a.getDR();
        if(a.getResult()!=null){
            if(a.getResult().equalsIgnoreCase("w")){
                match_win+=1;
            }
            else if(a.getResult().equalsIgnoreCase("l")){
                match_lose+=1;
            }
            else{
                JOptionPane.showMessageDialog(null,"請輸入w(win)或l(lose)");
            }  
    
        }
        
    }
    public void setMap(String m){
        map = m;
    }
    public void setMN(int m){
        match_number = m;
    }
    public void setTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        int year = currentDateTime.getYear();
        int month = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        time = String.valueOf(year)+"年"+String.valueOf(month)+"月"+String.valueOf(day)+"日"+String.valueOf(hour)+"時"+String.valueOf(minute)+"分";
    }
    public void setTotal_kill(int k){
        total_kill = k;
    }  
    public void setTotal_death(int d){
        total_death = d;
    }
    public void setTotal_assistance(int a){
        total_assistance = a;
    }
    public String getTime(){
        return time;
    }
    public String getMap(){
        return map;
    }
    public int getTotal_kill(){
        return total_kill;
    }
    public int getTotal_death(){
        return total_death;
    }
    public int getTotal_assistance(){
        return total_assistance;
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
    public String getResult(){
        return result;
    }
    public String getAgentName(){
        return agent_name;
    }
    public int getMN(){
        return match_number;
    }
    public double getDR(){
        return DR;
    }
    public double ComputeKD(){
        return total_kill/total_death;
    }
    public double ComputeWinRate(){
        return match_win/match_lose;
    }
    public String getPoint(){
        return String.valueOf(win_roumd)+":"+String.valueOf(lose_round);
    }
    public String getInfo(){
        return "Match: " +getMN()+"\nTime: "+getTime()+"\nMap :"+getMap()+"\nAgent: "+getAgentName()+"\nKDA: "+String.valueOf(getKill())+"/"+String.valueOf(getDeath())+"/"+String.valueOf(getAssistance())+"\nK/D: "+String.valueOf(getKill()/getDeath())+"\nADR: "+getDR();
    }


}
