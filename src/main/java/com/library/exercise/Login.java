package com.library.exercise;


public class Login extends User {
    private long loginNumber;

    public Login(String firstName, String lastName, String email, String password, long loginNumber){
        super(firstName, lastName, email, password);
        this.loginNumber = loginNumber;
    }


}
