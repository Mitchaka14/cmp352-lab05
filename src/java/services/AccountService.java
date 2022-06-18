/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.user;

/**
 *
 * @author mitch
 */
public class AccountService {
    
    public user login(String username, String password){
        
        if((username.equals("abe") || username.equals("barb")) && password.equals("password")){
            return new user(username, password);
        }
        return null;
        
    }
    
}
