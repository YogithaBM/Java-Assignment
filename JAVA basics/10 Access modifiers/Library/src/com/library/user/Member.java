package com.library.user;

public class Member {
    private void verifyMember(String name){
        System.out.println("Member : "+name);
    }
    private void checkId(int id){
        System.out.println("ID : "+id);
    }
    public void displayMember(String name,int id){
        verifyMember(name);
        checkId(id);
        System.out.println("Member Verified");

    }
}
