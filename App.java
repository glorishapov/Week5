package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		Logger astLogger = new AsteriskLogger();
		Logger spaceLogger = new SpacedLogger();
		
		System.out.println("Asterisk Logger: \n");
		astLogger.log("All good");
		System.out.println("\n");
		astLogger.error("File not found");
		
		
		System.out.println("\n\nSpaced Logger: \n");
		spaceLogger.log("No errors");
		System.out.println("\n");
		spaceLogger.error("Out of bounds");

	}

}
