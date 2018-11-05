package project1;

public class DogList {
	//declare an array of type of Dog array 
	private Dog[] dogList = new Dog[5];
	// can also do this
	//private Dog dogList[] = new Dog[5];
	
	private int i = 0;
	
	public void add(Dog d) {
		if (i<dogList.length) {
			dogList[i] = d;
			System.out.println("Dog added at index " + i);
			i++;
		}
	}
}
