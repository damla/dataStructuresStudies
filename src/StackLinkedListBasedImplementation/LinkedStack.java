package StackLinkedListBasedImplementation;

public class LinkedStack {
/*   --Notes About Linked List Based Stack--
 * 
 * No need for fixed number of elements.
 * Linked list can dynamically organize data.
 * In a linked representation, top is a node for the top element in stack.
 */
	
	private Node top;
	
	public LinkedStack() {
// Initializes the stack and sets top to null.
		
		top=null;
		
	}
	
	public boolean isEmpty() {
// Checks if the list is empty or not.
// The stack only will be full if we run out of memory.
		
		return(top==null); 
	}
	
	public void initializeStack() {
		
		top=null; 
		
	}
	
	public void push(int newElement) {
		
		Node newNode=new Node(newElement,top); //link is top
		top=newNode;
		
	}
	
	public void top() {
// Demonstrates the top element.
		
		if(top==null) {
		System.out.println("Stack is empty.");
		}
		else
		System.out.println(top.getInfo()); //gets the data of top element.
	}
	
	public boolean pop() {
// Check if the l	ist is empty or not, then delete the first element by changing tops link.		
		
		if(isEmpty()) {
			return false;
		}
		else {
		top=top.getLink(); //Setting the link of top to the next element so this will delete the top element.
		return true;
		}
	}
	
	public void outputLinkedStack() {
		
		Node current=top; //current node will go around the list from top to the last element.
		
		while(current!=null) {
			
			System.out.println(current.getInfo());
			current=current.getLink();
			
		}
	}
	
	public void copyStack(LinkedStack otherStack) {
// The stack taken as an argument is assigned to this stack.
		
		top=otherStack.top; 
		
	}
	
	public boolean equals(LinkedStack otherStack) {
// Checks whether the top of the stack taken as the argument is equal to the top of the stack calling the method.		
	
		if(top==otherStack.top) {
			return true;
		}
		else
			return false;
}
	
	public int size() {
// Checks the size of list.		
		int count=0;
		Node current=top;
		
		while(current!=null) {
			count++;
			current=current.getLink();
		}
		return count;

	}
}
/*Methods that we added:
 * isEmpty
 * initializeStack
 * push
 * pop
 * top
 * outputLinkedStack
 * copyStack
 * equals
 * size
 */