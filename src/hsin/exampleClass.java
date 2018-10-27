package hsin;

// demo how to use a class. use this in hello.java
public class exampleClass {
	private String girlName; //declare private variable
	
	//constructor - method with same name as the class
	public exampleClass(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() { //return String
		return girlName;
	}
	
	public void saying() {
		// print f to using format
		System.out.printf("The girl's name is %s", getName());
	}
	
	public void simpleMessage(String name) {
		System.out.println("Hello " + name);
	}
}
