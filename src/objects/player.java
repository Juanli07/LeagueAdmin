
package objects;

public class player {
    private int idPlayer;
    private String name;
    private String teamName;
    private String position;
    private int goals;
    private int penalties;
    
    public player(int idP, String name, String teamN, String pos, int gls, int plt){
        this.idPlayer = idP;
        this.name = name;
        this.teamName = teamN;
        this.position = pos;
        this.goals = gls;
        this.penalties = plt;
    }
    
    public int getIdPlayer(){
        return this.idPlayer;
    }
    
    public String getTeamName(){
        return this.teamName;
    }
    
    public String getPosition(){
        return this.position;
    }
    
    public int getGoals(){
        return this.goals;
    }
    
    public int getPenalties(){
        return this.penalties;
    }
}
