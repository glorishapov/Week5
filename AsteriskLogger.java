package com.promineotech;

//Implementing the Logger interface
public class AsteriskLogger implements Logger{

	//Implementing the log method from the Logger interface
	@Override
	public void log(String words) {
		//Printing the passed in string to the console with three asterisks at the front and the end of the string. 
		System.out.println("***" + words + "***");
		
	}
	
	//Implementing the error method from the Logger interface
	@Override
	public void error(String error) {
		
		//Creating local variables
		String print = "***Error: ";
		String aster = "*";
		String box = "";
		//Concatenating the passed string to the string that will print to the console. 
		print = print.concat(error);
		
		//Adding asterisks to the end of the passed in String
		for (int i = 0; i < 3; i++ ) {
			print = print.concat(aster);
		}
		
		//Creating the lines of asterisks that will make the box.
		//Making sure the box lines are the same length as the error line
		for(int i = 0; i < print.length(); i++) {
			box = box.concat(aster);
		}
		//Printing the box and message to the console. 
		System.out.println(box);
		System.out.println(print);
		System.out.println(box);
		
	}

}
