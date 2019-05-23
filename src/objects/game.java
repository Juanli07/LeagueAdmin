
package objects;


public class game {
    private int id;
    private int journal;
    private String teams;
    private String schedule;
    private String date;
    private String scorers;
    
    
    public game(int id, int jrnl, String teams, String schedule, String date, String scorers){
        this.id = id;
        this.journal = jrnl;
        this.teams = teams;
        this.schedule = schedule;
        this.date = date;
        this.scorers = scorers;
        
    }
    
    public int getId(){
        return this.id;
    }
    public int getJournal(){
        return this.journal;
    }
    
    public String getTeams(){
        return this.teams;
    }
    public String getSchedule(){
        return this.schedule;
    }
    public String getDate(){
        return this.date;
    }
    public String getScorers(){
        return this.scorers;
    }
    
}
