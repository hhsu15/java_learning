package hsin;

public class explainFinal {
	private int sum;
	private final int NUMBER; //like CONST in javascript, you can't change it, by convention use uppercase
	
	//constructor
	public explainFinal(int x) {
		NUMBER = x; //stays the value forever
	}
	
	public void add() {
		sum += NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
	}	
}


