package hsin;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumSet;


public class entryPoint1 {
	public static void main(String args[]) {
		//use the 4 different constructor 
		multi_constructor myobj1 = new multi_constructor();
		System.out.println(myobj1.toMilitary());
		
		multi_constructor myobj2 = new multi_constructor(5);
		System.out.println(myobj2.toMilitary());
		
		multi_constructor myobj3 = new multi_constructor(5,30);
		System.out.println(myobj3.toMilitary());
		
		multi_constructor myobj4 = new multi_constructor(5,30,30);
		System.out.println(myobj4.toMilitary());
		
		//example of string representation 
		tostring myobj5 = new tostring("Hsin"); //member 1
		tostring myobj5_2 = new tostring("Jess"); //member 2
		System.out.println(myobj5_2.getMembers());
		System.out.println(tostring.getMembers()); //a little trick you can access "static" method
		
		//example of enum
		for (enums people:enums.values()) { //java automatically gives you this static method to access the array of your enum
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
			
		}
		
		//use range
		for (enums people: EnumSet.range(enums.jess, enums.mike)) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		
		//hashmap <keytype, valuetype>
		Map<String, String> map = new HashMap<>();
		map.put("name", new String("Hsin"));
		Object value = map.get("name"); 
		System.out.println(value);
		
		
	}
}
