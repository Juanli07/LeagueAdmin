
package leagueadmin;
import SQL.conection;

public class LeagueAdmin {

    public static void main(String[] args) {
       Starting st = new Starting();
        st.setVisible(true);
        st.setLocationRelativeTo(null);
        try{
         Thread.sleep(1000);    
       }catch(InterruptedException e){}
        st.dispose();
        PrincipalWin pw = new PrincipalWin();
        pw.setVisible(true);
        pw.setTitle("LeagueAdmin");
        pw.setLocationRelativeTo(null);
    }
    
}
