package com.library.exercise;

public class Registration extends User {

    private long numberRegistration;

    public Registration(String firstName, String lastName, String email,
                        String password, long numberRegistration) {
        super(firstName, lastName, email, password);
        this.numberRegistration = numberRegistration;
    }

    
}
