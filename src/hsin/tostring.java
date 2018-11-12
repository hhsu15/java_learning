package hsin;

public class tostring {
	private String name;
	private String first;
	private String last;
	//static is shared between all instances, if you change it it will change all
	//also with static you can use the class to directly access it without using an instance
	private static int members = 0;
	
	public tostring(String n) {
		name = n;
		members++; //this will keep going up since count is static
		// you can't use println for toString
		System.out.printf("constructor of %s\n", this);
	}

	//string representation of object
	public String toString() {
		return String.format("%s\tMember of %d", name, members);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
}
