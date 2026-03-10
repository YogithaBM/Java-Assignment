package com.shopping.user;

public class Registration {
    private void checkEmail(String email){
        System.out.println("Email : "+email);
    }
    private void checkPhone(String phone){
        System.out.println("Phone : "+phone);
    }
    public void registerUser(String email, String phone){
        System.out.println("Register User");
        checkEmail(email);
        checkPhone(phone);

    }
}
