package com.carsonb.models;

public class LoginModel {

    private String username;
    private String password;

    public LoginModel(String username, String password){
        super();
        this.username = username;
        this.password = password;
    }

    public LoginModel(){
        super();
    }

    @Override
    public String toString(){
        return "LoginModel [username= " + username + " password= " + password + "]";
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
