package project1;

public class entrypoint {
	public static void main(String[] args) {
		//example of doglist which is not ideal
//		DogList dl = new DogList();
//		Dog d = new Dog();
//		dl.add(d);
		
		AnimalList al = new AnimalList();
		Dog d1 = new Dog();
		Fish f1 = new Fish();
		al.add(d1);
		al.add(f1);
		
	}
}
