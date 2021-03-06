package com.library.exercise.domain;


import com.library.exercise.security.LoginView;

import java.io.IOException;
import java.util.List;

public class ExerciseApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Registration registration1 = new Registration ("Kasia", "Kowalska",
				"kasiak@gmail.com", "123456l", 3445L);
		Registration registration2 = new Registration ("Tomek", "Nowak",
				"tnowak@gmail.com", "654123l", 3446L);

		Login login1 = new Login ("Staszek", "Nowakowski",
				"snowakowski@gmail.com", "lkjh4569", 3548l);
		Login login2 = new Login ("Adam", "Korona",
				"akorona@gmail.com", "ldsa5948", 3549l);

		UserRepository userRepository = null;
		LoginView loginView = new LoginView (userRepository);
		loginView.initialize ();

		//	System.out.println (registration1);;
		//	System.out.println(registration2);

		System.out.println (login1);
		System.out.println (login2);

		System.out.println ("Dodano");

		//userRepository = new FileUserRepository ();
		//userRepository.insert (registration1);
		userRepository = new FileUserRepository ();
		//userRepository.insert(login1);
		//userRepository.insert(login2);
		loginView = new LoginView();
		loginView.initialize ();


		List<User> users = userRepository.findAll ();

		System.out.println ("Lista");
		System.out.println (users);


	}

}
