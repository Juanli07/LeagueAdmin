
package SQL;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import objects.*;
import java.util.ArrayList;



public class conection {
    public static final String url = "jdbc:mysql://localhost:3306/league?autoReconnect=true&amp;useSSL=false</property>";
    public static final String username = "root";
    public static final String password = "1431";
    
    public ArrayList<team> getdata(){
         ArrayList<team> teams = new ArrayList<>();
        try {
            Connection con = null;
            con = getConnection();
            
            PreparedStatement ps;
            ResultSet res;
            
            ps = con.prepareStatement("SELECT * FROM team ORDER BY point");
            res= ps.executeQuery();
            while(res.next()){
                teams.add(new team(res.getString("name"), res.getInt("games_played"), res.getInt("games_won"), res.getInt("games_tied"), res.getInt("lost_games"), res.getInt("pending_games"), res.getInt("goals_favor"), res.getInt("goals_againts"), res.getInt("difference"), res.getInt("points")));
                System.out.print("Dato agregado");
            }
            for(team t : teams){
                System.out.println(1);
                System.out.println(t.getTeamName());
            }
            return teams;
        } catch (Exception e) {

        }
        return teams;
    }
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }
        return con;
    }

}
