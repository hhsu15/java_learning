package hsin;

//enumerators   CONSTANTS that are also objects
public enum enums {
	shane("nice","22"),
	jess("cutie", "10"),
	kyle("super cute", "5"),
	john("nothing", "10"),
	mike("normal", "3");
	
	private final String desc;
	private final String year;
	
	//constructor, notice it has the same name as the enum(like class)
	enums(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
