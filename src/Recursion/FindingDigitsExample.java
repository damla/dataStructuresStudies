package Recursion;

public class FindingDigitsExample {

	public static int findDigit(int number) { //Recursive functions can not have void.
		
		int digit=0;
		
		if(number!= 0) {
			digit++;
			return findDigit(number/10);
		}
		
		else {		
			return digit;
		}
	}
	
	public static void main(String[]args) {
		
		int a=findDigit(124); 
		System.out.println(a);
		
	}
}
//This version does not working. Trying to find out the solution.