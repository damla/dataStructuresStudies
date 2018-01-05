package LinearSearch;

import java.util.Scanner;

public class Test {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int searchKey;
		int position;
		
		LinearArray x=new LinearArray(10); //Generated new array with 10 elements.	
		System.out.println(x); //Printing the array before search.
		
		System.out.println("Please enter an integer value (-1 to quit): ");
		searchKey=sc.nextInt(); //Got the value we search for.
		
		while(searchKey!= -1) { //This loop is here to understand if user wants to exit or not.
		// If user does not wants to exit, search for the input.
			
			position=x.linearSearch(searchKey);
			if(position == -1)
				System.out.println("The integer " +searchKey+ " was not found.");
			else
				System.out.println("The integer "+searchKey+ " was found in position "+ position + ".");
			
			System.out.println("Please enter an integer value (-1 to quit): ");
			searchKey=sc.nextInt();
		}
		sc.close();
	}
}
