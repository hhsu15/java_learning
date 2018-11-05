package hsin;

public class tostring {
	private String name;
	//static is shared by all instances, if you change it it will change all
	private static int count = 0;
	
	public tostring(String n) {
		name = n;
		count++; //this will keep going up since count is static
		// you can't use println for toString
		System.out.printf("constructor of %s\n", this);
	}

	//string representation of object
	public String toString() {
		return String.format("%s\tMember of %d", name, count);
	}
	
	public void sayhi() {
		System.out.println("hi");
	}
}
