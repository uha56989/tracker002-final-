public class Skye extends Agent{
    public Skye(int k,int d,int a,double dr,String r){
        setKill(k);
        setDeath(d);
        setAssistance(a);
        setDR(dr);
        setResult(r);
    }
    public Skye(){
        setKill(0);
        setDeath(0);
        setAssistance(0);
        setWin(0);
        setLose(0);
        setDR(0);
    }
    public String getAgentName(){
        return "Skye";
    }
    public String getInfo(){
        if(getWin()==0){
            return "角色: Skye\n"+"Win%: 0%\n"+"K/D/A: " + String.valueOf(getKill())+"/"+String.valueOf(getDeath())+"/"+String.valueOf(getAssistance())+ "\nK/D Ratio: "+String.valueOf(getKill()/getDeath())+"\nADR: "+String.valueOf(getDR());
        }
        return "角色: Skye\n"+"Win%: "+String.valueOf((getWin()/getWin()+getLose())*100)+"%\n"+"K/D/A: " + String.valueOf(getKill())+"/"+String.valueOf(getDeath())+"/"+String.valueOf(getAssistance())+ "\nK/D Ratio: "+String.valueOf(getKill()/getDeath())+"\nADR: "+String.valueOf(getDR());
    }
}
