
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
    
    public List<team> getTeams(){
         List<team> teams = new ArrayList<>();
        try {
            Connection con = getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM team ORDER BY points;");
            ResultSet res= ps.executeQuery();
            System.out.println(1);
            
            while(res.next()){
                teams.add(new team(res.getString("name"), res.getInt("games_played"), res.getInt("games_won"), res.getInt("games_tied"), res.getInt("lost_games"), res.getInt("pending_games"), res.getInt("goals_favor"), res.getInt("goals_againts"), res.getInt("difference"), res.getInt("points")));
                System.out.print("Dato agregado");
            }
        } catch (SQLException e) {
            System.out.println("No existen datos");
        }
        return teams;
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
