
package objects;

public class team {
    private String teamName;
    private int playedGames;
    private int gamesWon;
    private int gamesTied;
    private int gamesLost;
    private int pendingGames;
    private int goalsFavor;
    private int goalsAgainst;
    private int difference;
    private int points;
    private int tournament_id;
    
    public team(String tn, int pg, int gw, int gt, int gl, int penG, int gF, int gA, int dif, int pts, int tournament_id){
        this.teamName = tn;
        this.playedGames = pg;
        this.gamesWon = gw;
        this.gamesTied = gt;
        this.gamesLost = gl;
        this.pendingGames = penG;
        this.goalsFavor = gF;
        this.goalsAgainst = gA;
        this.difference = dif;
        this.points = pts;
        this.tournament_id = tournament_id;
    }
    
    public String getTeamName(){
        return this.teamName;
    }
    
    public int getPlayedGames(){
        return this.playedGames;
    }
    
    public int getGamesWon(){
        return this.gamesWon;
    }
    
    public int getGamesTied(){
        return this.gamesTied;
    }
    
    public int getgamesLost(){
        return this.gamesLost;
    }
    
    public int getPendingGames(){
        return this.pendingGames;
    }
    
    public int getGoalsFavor(){
        return this.goalsFavor;
    }
    
    public int getGoalsAgains(){
        return this.goalsAgainst;
    }
    
    public int getDifference(){
        return this.difference;
    }
    
    public int getPoints(){
        return this.points;
    }
    public int getTournament_id(){
        return this.tournament_id;
    }
    @Override
    public String toString(){
        return "Team {"+"name :"+this.teamName+"Played games :"+this.playedGames;
    }
}
