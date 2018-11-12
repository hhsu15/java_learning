package hsin;

import java.util.*;

//version is too old. Don't worry about it for now

class challenge {
	
	public static void main(String args[]) {
		fizzbuzz(15);
		int n = 5;
		//declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
        
        arrli.add(6);
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) {
            System.out.print(arrli.get(i)+" "); 
        }
        //create a file
        final Formatter x;
        try {
        	x = new Formatter("./src/text_file.txt");
        	System.out.println("You created a file");
        }
        catch(Exception e) {
        	System.out.println("You got an error");
        }
        
        //let's try string builder
        StringBuilder sb = new StringBuilder("hi there");
        System.out.println(sb.substring(0,5));
	}
	
	public static void fizzbuzz(int n) {
		
		for (int i=0; i<=n; i++) {
			String result = "";
			if (i % 3 == 0) {
				result += "fizz";
			}
			if (i % 5 == 0) {
				result += "buzz";
			}
			if (result != "") {
				System.out.println(result);
			}else {
			System.out.println(i);
			}
			
		}
	}	
}