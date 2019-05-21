
package objects;


public class game {
    private int journal;
    private String team1;
    private String team2;
    private int goalsT1;
    private int goalsT2;
    private String Scorers;
    
    
    public game(int jrnl, String tm1, String tm2, int gT1, int gT2, String scrs){
        this.journal = jrnl;
        this.team1 = tm1;
        this.team2 = tm2;
        this.goalsT1 = gT1;
        this.goalsT2 = gT2;
        this.Scorers = scrs;
    }
    
    public int getJournal(){
        return this.journal;
    }
    
    public String getTeam1(){
        return this.team1;
    }
    
    public String getTeam2(){
        return this.team2;
    }
    
    public int getGoalsT1(){
        return this.goalsT1;
    }
    
    public int getGoalsT2(){
        return this.goalsT2;
    }
    
    public String getScorers(){
        return this.Scorers;
    }
}
