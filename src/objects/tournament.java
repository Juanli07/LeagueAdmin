
package objects;

public class tournament {
    private String tournamentName;
    private int tournamentDays;
    private String tournamentDescription;
    
    public tournament(String tn, int td, String tD){
        this.tournamentName = tn;
        this.tournamentDays = td;
        this.tournamentDescription = tD;
    }
    
    public String getTournamentName(){
        return this.tournamentName;
    }
    
    public int getTournamentDays(){
        return this.tournamentDays;
    }
    
    public String getTournamentDescription(){
        return this.tournamentDescription;
    }
    
    public String toString(){
        return ("Tournament Name: " + this.tournamentName + " | Dournament Days: " + this.tournamentDays + " | Tournament Description: " + this.tournamentDescription);
    }
}
