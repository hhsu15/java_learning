package hsin;

import java.util.Random;

class loop {
	public static void main(String args[]) {
		//while loop
		int counter = 0;
		while (counter <= 10) {
			System.out.println(counter);
			counter++;
		}
		
		//for loop
		Random dice = new Random();
		int number;
		for (int i=0; i <= 10; i ++) {
			number = 1 + dice.nextInt(6);
			System.out.println("Number is: " + number);
		}
		
		// do while
		int count = 0;
		do { 
			System.out.println(count);
			count++;
		} while (count <= Math.max(5,10));
	}
}
