package com.carsonb.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginModel {

    @NotBlank(message="Username field must be completed")
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters")
    private String username;

    @NotBlank(message="Password field must be completed")
    @Size(min=7, max=25, message="password must be between 7 and 25 characters")
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
