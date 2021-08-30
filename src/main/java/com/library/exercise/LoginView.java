package com.library.exercise;

import java.util.Scanner;

public class LoginView {



    private UserRepository userRepository;
    public LoginView(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginView() {

    }

    public void initialize(){

        System.out.println ();
        System.out.println ("===== EKRAN LOGOWANIA");
        System.out.println ("Podaj adres email:");
        Scanner scanner = new Scanner (System.in);
        String email = scanner.nextLine ();
        System.out.println ("Podaj hasło: ");
        String password = scanner.nextLine ();
        boolean result = userRepository.existsByEmailAndPassword (email, password);
        System.out.println ("result ="+result);

    }

}
