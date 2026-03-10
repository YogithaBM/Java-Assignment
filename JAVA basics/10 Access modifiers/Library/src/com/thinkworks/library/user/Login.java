package com.library.user;

public class Login {
    private void validateUsername(String username){
        System.out.println("Username : "+username);
    }
    private void validatePassword(int password){
        System.out.println("Password : "+password);
    }
    public void displayLogin(String username,int password){
        validateUsername(username);
        validatePassword(password);
        System.out.println("Login Successful");

    }
}
