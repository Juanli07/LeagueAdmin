
package objects;


public class game {
    private int id;
    private int journal;
    private String teams;
    private String schedule;
    private String maker;
    private String date;
    private String scorers;
    
    
    public game(int id, int jrnl, String teams, String schedule, String maker, String date, String scorers){
        this.id = id;
        this.journal = jrnl;
        this.teams = teams;
        this.schedule = schedule;
        this.date = date;
        this.scorers = scorers;
        this.maker = maker;
        
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
    public String getMaker(){
        return this.maker;
    }
    public String getDate(){
        return this.date;
    }
    public String getScorers(){
        return this.scorers;
    }
    
}
