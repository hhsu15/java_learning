package hsin;

import java.util.Random;

public class array{
	public static void main(String args[]) {
		//declare an array that has five elements as int
		int myArray[] = new int[5];
		
		myArray[0] = 10;
		myArray[1] = 19;
		myArray[2] = 27;
		myArray[3] = 50;
		myArray[4] = 30;
		
		System.out.println(myArray[0]);
		
		//array initializer
		int myArray2[] = {3,5,7,8};
		System.out.println(myArray2[2]);
		
		//output a table using array
		System.out.println("Index\tValue"); //\t for tab(4 spaces)
		int myArray3[] = {3, 5, 7, 8};
		for (int count=0; count<=myArray3.length; count++) {
			System.out.println(count + "\t" + myArray[count]);
		}
		
		//expand the array
		Random rand = new Random();
		int freq[] = new int[7];
		
		//loop thru 1000 times, each time increment on random one of index(1-6)
		for (int roll=1; roll<1000; roll++) {
			++freq[1+rand.nextInt(6)]; //pre-increment - adding 1 right away
		}
		//System.out.println(freq.length); This is 7
		System.out.println("Face\tFrequecy");
		for (int i=0; i<freq.length; i++) {
			System.out.println(i + "\t"+ freq[i]);
		}
		
		//enhanced for loop statement
		int myArray4[] = {1, 3, 5, 6};
		double sum = 0;
		for (int each_num: myArray4) {
			sum += each_num;
		}
		System.out.println("Total is "+ sum);
		
		//call the method "change" to change array
		int myArray5[] = {1, 3, 5, 6, 9};
		change(myArray5);
		for(int i: myArray5) {
			System.out.println("Changed element to "+ i);
		}
		
		//multi dimentional array
		int firstArray[][]= {{1,2,5}, {3, 7},{4, 6, 7}};
		System.out.println(firstArray[0][2]); //should return 5
		
		//call displayTable method to print out multi dimentional array
		System.out.println("Display array in table");
		displayTable(firstArray);
		
		//call average method with random numer of args
		System.out.println("average number is: " + average(2,5,78,10));	
	}
	
	//a method that takes an array as parameter
	public static void change(int myArray5[]) {
		for(int i=0; i<myArray5.length; i++) {
			myArray5[i] += 5;
		}
		
	}
	
	public static void displayTable(int multiArray[][]) {
		for(int row=0; row<multiArray.length; row++) {
			System.out.print(row + "\t"); //print out index
			for(int col=0; col<multiArray[row].length; col++) {
				System.out.print(multiArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	//method that takes unknown numnber of args
	//I think the ... will actually take the passed args and make it an array
	public static int average(int...numbers) {
		int total = 0;
		for(int x: numbers) {
			total += x;
		}
		return (total/numbers.length);
	}
	
	

}
