
package hotelmaster;

/**
 *
 * @author mathe_000
 */
public abstract class Account {
    String email;   
    String password;
    
    public Account(String email, String password){
        this.email = email;
        this.password = password;
        //attempt to login
    }
    
    
    public Account(String uid){
        //query the DB for uid, filling email and password
    }
    
    public void changePassword(String oldPass, String newPass){
     
        //Testing Git Hub Here
     //hi
        
        //toast
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
