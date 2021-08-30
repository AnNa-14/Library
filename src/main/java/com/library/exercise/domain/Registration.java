package com.library.exercise.domain;

public class Registration extends User {

    private long numberRegistration;

    public Registration(String firstName, String lastName, String email,
                        String password, long numberRegistration) {
        super(firstName, lastName, email, password);
        this.numberRegistration = numberRegistration;
    }

    @Override
    public String toString() {
        return super.toString ()+" (Register no: "+numberRegistration+")";
    }
}
