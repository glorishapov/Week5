package com.promineotech;

//Implementing the Logger Interface
public class SpacedLogger  implements Logger{

	//Implementing the log method from the Logger interface
	@Override
	public void log(String words) {
		//Replacing all empty substrings with a space and trimming leading and trailing spaces. 
		words = words.replace("", " ").trim();
		//Printing result to the console
		System.out.println(words);
		
	}

	//Implementing the error method from the Logger interface
	@Override
	public void error(String error) {
		//Replacing all empty substrings with a space and trimming leading and trailing spaces. 
		error = error.replace("", " ").trim();
		//Printing result to the console
		System.out.println("ERROR: " + error);
		
	}

}
