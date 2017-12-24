package Stack;

import java.util.Scanner;

/*           --Notes About Stack-- 
 * 
 * List of homogeneous elements.
 * Last in first out data structure.
 * Stack element is only accessed through top.
 * If top is 0 the stack is empty.
 * If top is nonzero the stack is not empty and the top element of the stack
 * is given by top-1.
 * */

public class StackArrayBased {
	
	private int[] stackArray; //creating stack array.
	private int size; //Size of stack.
	private int top; //Top element of stack.
	
// We have two constructors in array based implementation;
	
	
	public StackArrayBased(int size) { 

// 1st constructor is for setting the stack size by user, setting top to 0
// and creating the array.
	
	Scanner sc=new Scanner(System.in);
	while(size <=0) { //In case of user enters invalid input.
	
	this.size=size;
	
	System.out.println("Please enter a valid number:");
	size=sc.nextInt();
	
	}
	sc.close();
	
	this.size=size;
	
	top=0;
	stackArray= new int[size];

	}
	
	
	public StackArrayBased() {

// 2nd constructor is default constructor. Sets stack size to default size(10), sets top to 0
// and creates the array.
	
	size=10;
	top=0;
	stackArray=new int[size];
		
	}
	
	
	public void initializeStack() {

// Initialize stack is to take stack empty state.
// Setting top to 0 initialize the stack.
		
	top=0;
	
	}
	
	
	public boolean isEmpty() {

// isEmpty methods decides if the stack is empty or not by checking top element.
	
	return (top==0);
		
	}
	
	
	public boolean isFull() {

// isFull method decides if the stack is full or not.
	
	return(size==top); //top is always +1 from the last index.
		
	}
	
	
	public boolean push(int newItem) {
		
// push method is for adding element. Check if stack is empty or not(isFull Method). Increase top by one.
		
	if(!isFull()) {
		
		stackArray[top]= newItem; //if the stack is not full, add the item to top.
		top++; //increase top.
		
		return true;
	}
	else
		return false;
		
	}
	
	
	public boolean pop() {
		
// pop method is for deleting top element. The stack must be not empty. Decrease top by one.
		
	if(!isEmpty()) {
		
		top--;
		return true;
		
	}
	else
		return false;
		
	}
	
	
	public int top() {
		
// top method sometimes called as the peek() method. The stack must be not empty. Returns the top element of the stack.		
	
	assert(isEmpty()); //in assert, if the statement is false it will terminate so in this case, if the stack is empty, it will terminate.
	
	return stackArray[top-1]; //In the other case, it will return the top-1 because the last element's index is top-1.
	
	}
	
	
	public void copyStack(StackArrayBased newStack) { 
		
// copying the other stack into existing stack 
	
	size=newStack.size; //by .size we are reaching to newStack's size.
	top=newStack.top; //by .top we are reaching to newStack's top.
	stackArray=new int[size];
	
	   for(int j=0; j<top; j++) {
		
		stackArray[j]=newStack.stackArray[j];
		
	   }
	}

	
	public StackArrayBased(StackArrayBased otherStack) {
		
		copyStack(otherStack); //While creating a new stack, it will take the other stack's values.
	
	}
	
	
	public boolean equals(StackArrayBased otherStack) {
// Checks if the stack taken as argument is equal to the stack calling the method.
		
		if(size!=otherStack.size) { //Not equal
		
			return false;
		}
		
		else { 
			
			for(int i=0; i<size; i++) { //Checks every element if they are equal.
				
				if(stackArray[i]!=otherStack.stackArray[i])
				
				return false;
			
			}
		} 
		
		return true;
	}
	
	
	public void outputStack() {
		
		if(!isEmpty()) { //If stack if not empty
			
			for(int i=top-1; i>=0; i--) {  //Prints out from the top element to the base element.
				
				System.out.println(stackArray[i]);
				
			}
			
		}
		
	}

}
