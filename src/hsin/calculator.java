package hsin;
import java.util.Scanner;

class calculator {
	public static void main(String args[]) {
		Scanner user_input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = user_input.nextDouble(); //nextDouble for double
		System.out.println("Enter second num: ");
		snum = user_input.nextDouble();
		
		answer = fnum + snum;
		System.out.println("answer is " + answer);
		
	}
}
