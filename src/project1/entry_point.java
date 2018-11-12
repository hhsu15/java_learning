package project1;

public class entry_point {
	public static void main(String args[]) {
		Animal[] theList = new Animal[2];
		Animal d = new Dog();
		Animal f = new Fish();
		
		theList[0] = d;
		theList[1] = f;
		
		for (Animal x:theList) {
			x.noise();
		}
	}

}
