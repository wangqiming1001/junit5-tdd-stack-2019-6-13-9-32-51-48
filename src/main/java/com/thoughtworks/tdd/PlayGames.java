package com.thoughtworks.tdd;

public class PlayGames {

	private static String FIZZ = "FIZZ";
	private static String BUZZ = "BUZZ";
	private static String WHIZZ = "WHIZZ";
	
	public String fizzBuzzWhizz(int i) {
		
		String result = "";
		if (i < 1 || i > 120) {
			return "please input valid number !";
		}
		if (i % 3 == 0) {
			result += FIZZ;
		}
		if (i % 5 == 0) {
			result += BUZZ;
		}
		if (i % 7 == 0) {
			result += WHIZZ;
		}
		if (result == "") {
			result = String.valueOf(i);
		}
		System.out.println(result);
		return result;   
	}


}
