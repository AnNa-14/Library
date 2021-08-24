package com.library.exercise;


public class ExerciseApplication {

	public static void main(String[] args) {
		Registration registration1 = new Registration ("Kasia","Kowalska",
				"kasiak@gmail.com","123456l",3445L);
		Registration registration2 = new Registration ("Tomek","Nowak",
				"tnowak@gmail.com","654123l",3446L);

		Login login1 = new Login ("Staszek", "Nowakowski",
				"snowakowski@gmail.com","lkjh4569",3548l );
		Login login2 = new Login ("Adam", "Korona",
				"akorona@gmail.com","ldsa5948",3549l );
	}

}
