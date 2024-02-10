package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		//Creating an instance of the AsteriskLogger Class that implements the Logger interface
		Logger astLogger = new AsteriskLogger();
		
		//Creating an instance of the SpacedLogger Class that implements the Logger interface
		Logger spaceLogger = new SpacedLogger();
		
		System.out.println("Asterisk Logger: \n");
		
		//Passing a string into the log method implemented in the AsteriskLogger Class
		astLogger.log("All good");
		System.out.println("\n");
		
		//Passing a string into the error  method implemented in the AsteriskLogger Class
		astLogger.error("File not found");
		
		
		System.out.println("\n\nSpaced Logger: \n");
		
		//Passing a string into the log method implemented in the SpacedLogger Class
		spaceLogger.log("No errors");
		System.out.println("\n");
		
		//Passing a string into the error method implemented in the SpacedLogger Class
		spaceLogger.error("Out of bounds");

	}

}
