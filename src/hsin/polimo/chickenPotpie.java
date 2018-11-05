package hsin.polimo;

public class chickenPotpie {
	public static void main(String[] args) {
		
		// datatype is the super class food
		// declare an array of 2 food instances
		// since potpie and tuna are both of class of food
		food myFood[] = new food[2];
		myFood[0] = new potpie(); 
		myFood[1] = new tuna();
		
		//polymorphic array
		for(int i=0; i<myFood.length; i++) {
			myFood[i].eat();
		}
		
		//pass the super class food
		fatty hsin = new fatty();
		
		//food myFood2 = new food(); //this is not allowed once food is abstract
		food myFood2 = new tuna();
		hsin.digest(myFood2);
		//you can also pass the subclass 
		food myFood3 = new potpie();
		hsin.digest(myFood3);
		
	}
}
