package com.thoughtworks.tdd;

public class PlayGames {

	private static String FIZZ = "FIZZ";
	private static String BUZZ = "BUZZ";
	private static String WHIZZ = "WHIZZ";
	
	public String fizzBuzzWhizz(int i) {
		// TODO Auto-generated method stub
		if (i < 1 || i > 120) {
			return "please input valid number !";
		}
		if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
			return FIZZ + BUZZ + WHIZZ;
		}
		if (i % 3 == 0 && i % 5 == 0) {
			return FIZZ + BUZZ;
		}
		if (i % 3 == 0 && i % 7 == 0) {
			return FIZZ + WHIZZ;
		}
		if (i % 5 == 0 && i % 7 == 0) {
			return BUZZ + WHIZZ;
		}
		if (i % 3 == 0) {
			return FIZZ;
		}
		if (i % 5 == 0) {
			return BUZZ;
		}
		if (i % 7 == 0) {
			return WHIZZ;
		}
		return String.valueOf(i);
	}


}
