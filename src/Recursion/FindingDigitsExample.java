package Recursion;

public class FindingDigitsExample {
	
	public static int digit=1; //Digit has to be static and at the outside of the findDigit method. 
	
	public static int findDigit(int number) { //Recursive functions can not have void.
			
		if(number<10 && number > -10) //Base case for one digit numbers.
			return digit;
		
		else {
			digit++;
			return findDigit(number/10); //Divides the number while increasing digit until it becomes zero. When number is zero, it will return digit.
		}
		
	}
	public static void main(String[]args) {	
		
		System.out.println(findDigit(100));
	}
}