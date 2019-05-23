
package objects;

public class user {
    private String User;
    
    public user(String usr){
        this.User = usr;
    }
    
    public String getUser(){
        return this.User;
    }
    
    public String toString(){
        return ("User: " + this.User);
    }
}
