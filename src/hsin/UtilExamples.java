package hsin;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UtilExamples {
	public static void main(String args[]) {
	 //create an ArrayList of String
		List<String> members = new ArrayList<>();
		
		//add members
		members.add("Hsin");
		members.add("Jess");
		members.add("Kyle");
		print(members.toString());
		
		//use addAll to concat ArrayList
		List<String> nextMembers = new ArrayList<>();
		nextMembers.add("Bob");
		members.addAll(nextMembers);
		print(members.toString());
		
		//forEach loop
		members.forEach(item ->{
			print(item);
		});
		
		//Use Iterator -- this is similar to python generator
		Iterator<String> memberIterator = members.iterator();
		while (memberIterator.hasNext()) {
			String mb = memberIterator.next();
			print(mb);
		}
		
		//sort an ArrayList
		Collections.sort(members);
		print(members.toString());
		
	/*----------------------------------------------------*/	
	//HashMap
		Map<String, String> myMapping = new HashMap<>();
		myMapping.put("IS010", "Sales");
		myMapping.put("IS050", "Net Income");
		print(myMapping.toString());
		
		//Access key
		String fieldName = myMapping.get("IS010");
		print(fieldName);
		
		
		//get all keys (Set)
		Set<String> allKeys = myMapping.keySet();
		print(allKeys.toString());
		
		//iterate HashMap  -- basically same as the ArrayList
		myMapping.forEach((key, val) -> {
			print("the key is: "+ key + " and the value is " + val);
		});
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
