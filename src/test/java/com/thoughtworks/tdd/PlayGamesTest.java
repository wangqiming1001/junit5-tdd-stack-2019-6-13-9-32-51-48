package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayGamesTest {

	@Test
	public void should_return_0_when_input_InValid() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(0);
		Assertions.assertEquals("please input valid number !", result);
	}
	
	@Test
	public void should_return_1_when_input_1() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(1);
		Assertions.assertEquals("1", result);
	}
	
	@Test
	public void should_return_3_when_input_3() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(3);
		Assertions.assertEquals("FIZZ", result);
	}
	
	@Test
	public void should_return_5_when_input_5() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(5);
		Assertions.assertEquals("BUZZ", result);
	}
	
	@Test
	public void should_return_7_when_input_7() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(7);
		Assertions.assertEquals("WHIZZ", result);
	}
	
	@Test
	public void should_return_15_when_input_15() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(15);
		Assertions.assertEquals("FIZZBUZZ", result);
	}
	
	@Test
	public void should_return_21_when_input_21() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(21);
		Assertions.assertEquals("FIZZWHIZZ", result);
	}
	
	@Test
	public void should_return_35_when_input_35() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(35);
		Assertions.assertEquals("BUZZWHIZZ", result);
	}
	
	@Test
	public void should_return_105_when_input_105() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(105);
		Assertions.assertEquals("FIZZBUZZWHIZZ", result);
	}
	
	@Test
	public void should_return_121_when_input_InValid() {
		PlayGames playGames = new PlayGames();
		String result = playGames.fizzBuzzWhizz(121);
		Assertions.assertEquals("please input valid number !", result);
	}
}
