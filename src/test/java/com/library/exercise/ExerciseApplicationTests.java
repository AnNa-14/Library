package com.library.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExerciseApplicationTests {
@Autowired
Login secondComponent;

	@Test
	void contextLoads() {
	}
	@Test
	public void shouldContainSecond() {

		//given

		//when
		String text = secondComponent.getTwoTexts();

		//then

	//	assertThat(text.contains ("second")).isTrue();  //
	}


}
