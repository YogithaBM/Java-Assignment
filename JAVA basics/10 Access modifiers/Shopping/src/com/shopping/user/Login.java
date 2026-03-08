package com.shopping.user;

public class Login {
    private void validateUsername(String username){
        System.out.println("Validate Username : "+username);
    }
    private void validatePassword(String password){
        System.out.println("ValidatePassword : "+password);
    }
    public void loginUser(String username, String password){

        System.out.println("Login User");
        validateUsername(username);
        validatePassword(password);

    }
}
