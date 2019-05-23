
package objects;

public class user {
    private String User;
    private String password;
    private int tournament_id;
    
    public user(String usr, String password){
        this.User = usr;
        this.password = password;
    }
    public user(String usr, String password, int tournament_id){
        this.User = usr;
        this.password = password;
        this.tournament_id = tournament_id;
    }
    
    public String getUser(){
        return this.User;
    }
    
    public String toString(){
        return ("User: " + this.User);
    }
}
