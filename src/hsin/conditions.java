package hsin;

class conditions {
	public static void main(String args[]) {
		//if statement
		int test = 3;
		if (test < 9 && test > 5) {
			System.out.println("Yes");
		} else if (test == 3) {
			System.out.println("number is 3!");
		}
		
		else {
			System.out.println("No");
		}
		
		//switch statement
		int age = 2;
		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know");
			break;
		}
		
		//ternary operator
		int myAge = 18;
		System.out.println(myAge > 20 ? "You can drink" :" No you can't drink");
	}
}
 