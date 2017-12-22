package Recursion;

public class FindingDigitsExample {
	
	public static int digit=0; //Digit has to be static and at the outside of the findDigit method.
	
	public static int findDigit(int number) { //Recursive functions can not have void.	

		if(number!= 0) {
			digit++;
			return findDigit(number/10);
		}
		
		else if(number == 0) {		
			return digit;
		}
		
		else //for invalid conditions it returns 1.
			return 1; 
		
	}
	
	public static void main(String[]args) {
		
		int a=findDigit(50);
		System.out.println(a);
			
	}
}
//This version is working but there is a problem with zero.