/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmaster.account;

import hotelmaster.Report;
import hotelmaster.account.Account;

/**
 *
 * @author mathe_000
 */
public class Admin extends Account {
    
    public Admin(int id, String firstName, String lastName, String email, String password){
        super(id, firstName, lastName, email, password);
    }
    
    public void addRoom(){
    }
    
    public void deleteRoom(){
        
    }
    
    public void editRoom(){
        
    }
    
    public Report viewReport(){
        return null;
    }
}
