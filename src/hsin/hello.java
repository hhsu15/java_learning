package hsin;

import java.util.Scanner; //for taking user input

class hello {
	public static void main(String args[]) {  //method header
		System.out.println("Hello world!!!"); //println will add the line separate
		
		//declare data type variables
		double tuna;
		tuna = 5.28;
		
		System.out.print(tuna); //print will not create a line
		
		// use scanner to take user input
		Scanner user_input = new Scanner(System.in);
		// instantiate exampleClass
		exampleClass myObj = new exampleClass("Jess");
		
		//user prompt
		System.out.print("what is your name? ");
		//store the user input to variable "name"
		String name = user_input.nextLine();
		
		//invoke the simpleMessage method
		myObj.simpleMessage(name);
		
		//multiple methods
		System.out.println("what is your girl firend's name? ");
		String girlName = user_input.nextLine();
		exampleClass myObj2 = new exampleClass(girlName);
		myObj.saying();
	}
}
