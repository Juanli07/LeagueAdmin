
package SQL;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objects.*;
import java.util.ArrayList;
import java.util.List;



public class conection {
    public static final String URL = "jdbc:mysql://localhost:3306/league";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1431";
    // Seccion de las consultas get.
    public List<team> getTeams(int id){
         List<team> teams = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM team WHERE tournament_id ='"+id+"'ORDER BY points;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                teams.add(new team(res.getString("name"), res.getInt("games_played"), res.getInt("games_won"), res.getInt("games_tied"), res.getInt("lost_games"), res.getInt("pending_games"), res.getInt("goals_favor"), res.getInt("goals_againts"), res.getInt("difference"), res.getInt("points"), res.getInt("tournament_id")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return teams;
    }
    public List<player> getPlayers(){
         List<player> players = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM player ORDER BY goals;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                players.add(new player(res.getInt("id"), res.getString("name"), res.getString("team"), res.getString("possition"), res.getInt("goals"), res.getInt("penalties")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return players;
    }
    public List<tournament> getTournament(){
         List<tournament> tournaments = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tournament;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                tournaments.add(new tournament(res.getString("name"),res.getInt("duration"), res.getString("description")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return tournaments;
    }
    public List<user> getUser(){
         List<user> users = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                users.add(new user(res.getString("user"), res.getString("pass"), res.getInt("tournament_id")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return users;
    }
    public List<game> getPlayed_games(){
         List<game> games = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM played_games ORDER BY date;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                games.add(new game(res.getInt("id"), res.getInt("journal"), res.getString("teams"), res.getString("schedule"), res.getString("maker"), res.getString("date"), res.getString("scorers")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return games;
    }
    public List<game> getGames_to_play(){
         List<game> games = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM games_to_play ORDER BY date;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                games.add(new game(res.getInt("id"), res.getInt("journal"), res.getString("teams"), res.getString("schedule"), "0",  res.getString("date"), res.getString("scorers")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return games;
    }
    
    //seccion de las consultas Insert
    public void saveTeam(team t){
        boolean band = false;
        try {
            Connection con = getConnection();
            List<team> teams = this.getTeams(t.getTournament_id());
            for(team tm : teams){
                if (tm.getTeamName().equals(t.getTeamName())){
                    band = true;
                    break;
                }
            }
            if(!band){
               PreparedStatement ps = con.prepareStatement("INSER INTO team (name, games_played, games_won, games_tied, lost_games, pending_games, goals_favor, goals_againts, difference, points, tournament_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
               ps.setString(1, t.getTeamName());
               ps.setInt(2, t.getPlayedGames());
               ps.setInt(3, t.getGamesWon());
               ps.setInt(4, t.getGamesTied());
               ps.setInt(5, t.getgamesLost());
               ps.setInt(6, t.getPendingGames());
               ps.setInt(7, t.getGoalsFavor());
               ps.setInt(8, t.getGoalsAgains());
               ps.setInt(9, t.getDifference());
               ps.setInt(10, t.getPoints());
               ps.setInt(11, t.getTournament_id());
               ps.executeUpdate();
               
            }else{
                PreparedStatement ps = con.prepareStatement("UPDATE team SET name = ?, games_played = ?, games_won = ?, games_tied = ?, lost_games = ?, pending_games = ?, goals_favor = ?, goals_againts = ?, difference = ?, points = ?, tournament_id = ? WHERE name = ?");
                ps.setString(1, t.getTeamName());
                ps.setInt(2, t.getPlayedGames());
                ps.setInt(3, t.getGamesWon());
                ps.setInt(4, t.getGamesTied());
                ps.setInt(5, t.getgamesLost());
                ps.setInt(6, t.getPendingGames());
                ps.setInt(7, t.getGoalsFavor());
                ps.setInt(8, t.getGoalsAgains());
                ps.setInt(9, t.getDifference());
                ps.setInt(10, t.getPoints());
                ps.setInt(11, t.getTournament_id());
                ps.setString(12, t.getTeamName());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }
    public void savePlayed_games(game t){
        boolean band = false;
        try {
            Connection con = getConnection();
            List<game> teams = this.getPlayed_games();
            for(game tm : teams){
                if (tm.getId() == (t.getId())){
                    band = true;
                    break;
                }
            }
            if(!band){
               PreparedStatement ps = con.prepareStatement("INSER INTO team (id, journal, teams, schedule, marker, date, scorers) VALUES(?, ?, ?, ?, ?, ?, ?)");
               ps.setInt(1, t.getId());
               ps.setInt(2, t.getJournal());
               ps.setString(3, t.getTeams());
               ps.setString(4, t.getSchedule());
               ps.setString(5, t.getMaker());
               ps.setString(6, t.getDate());
               ps.setString(7, t.getScorers());
               ps.executeUpdate();
               
            }else{
                PreparedStatement ps = con.prepareStatement("UPDATE team SET id = ?, journal = ?, teams = ?, schedule = ?, marker = ?, date = ?, scorers= ? WHERE id = ?");
                ps.setInt(1, t.getId());
                ps.setInt(2, t.getJournal());
                ps.setString(3, t.getTeams());
                ps.setString(4, t.getSchedule());
                ps.setString(5, t.getMaker());
                ps.setString(6, t.getDate());
                ps.setString(7, t.getScorers());
                ps.setInt(8, t.getId());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }
    public void saveGames_to_play(game t){
        boolean band = false;
        try {
            Connection con = getConnection();
            List<game> teams = this.getPlayed_games();
            for(game tm : teams){
                if (tm.getId() == (t.getId())){
                    band = true;
                    break;
                }
            }
            if(!band){
               PreparedStatement ps = con.prepareStatement("INSER INTO team (id, journal, teams, schedule, marker, date, scorers) VALUES(?, ?, ?, ?, ?, ?, ?)");
               ps.setInt(1, t.getId());
               ps.setInt(2, t.getJournal());
               ps.setString(3, t.getTeams());
               ps.setString(4, t.getSchedule());
               ps.setString(5, "0");
               ps.setString(6, t.getDate());
               ps.setString(7, "0");
               ps.executeUpdate();
               
            }else{
                PreparedStatement ps = con.prepareStatement("UPDATE team SET id = ?, journal = ?, teams = ?, schedule = ?, marker = ?, date = ?, scorers= ? WHERE id = ?");
                ps.setInt(1, t.getId());
                ps.setInt(2, t.getJournal());
                ps.setString(3, t.getTeams());
                ps.setString(4, t.getSchedule());
                ps.setString(5, "0");
                ps.setString(6, t.getDate());
                ps.setString(7, "0");
                ps.setInt(8, t.getId());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        return con;
    }

}