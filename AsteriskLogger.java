package com.promineotech;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String words) {
		//Printing the passed in string to the console with three asterisks at the front and the end of the string. 
		System.out.println("***" + words + "***");
		
	}
	
	@Override
	public void error(String error) {
		
		//Creating local variables
		String temp = "***Error: ";
		String aster = "*";
		String box = "";
		temp = temp.concat(error);
		
		//Adding asterisks to the end of the passed in String
		for (int i = 0; i < 3; i++ ) {
			temp = temp.concat(aster);
		}
		
		//Creating the lines that will make the box.
		//Making sure the box lines are the same length as the error line
		for(int i = 0; i < temp.length(); i++) {
			box = box.concat(aster);
		}
		//Printing the box and message to the console. 
		System.out.println(box);
		System.out.println(temp);
		System.out.println(box);
		
	}

}
