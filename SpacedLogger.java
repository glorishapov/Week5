package com.promineotech;

public class SpacedLogger  implements Logger{

	@Override
	public void log(String words) {
		words = words.replace("", " ").trim();
		System.out.println(words);
		
	}

	@Override
	public void error(String error) {
		error = error.replace("", " ").trim();
		System.out.println("ERROR: " + error);
		
	}

}
