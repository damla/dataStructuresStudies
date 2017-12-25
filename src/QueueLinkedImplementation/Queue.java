package QueueLinkedImplementation;

public class Queue {

	private Node front;
	private Node rear;
	
	public Queue() {
// Default constructor
		
		front=null;
		rear=null;
		
	}
	
	public boolean isEmpty() {
		
		return(front==null); 
		
	}
// No need for isFull method because linked list can not be full.
	
	public void initializeQueue() {
		
		front=null;
		rear=null;
		
	}
	
	public int getFront() {
		
		assert(front != null); //if front is null, terminate.
		return front.getInfo();
		
	}
	
	public int getRear() {
		
		assert(rear != null); //if rear is null, terminate.
		return rear.getInfo(); 
	}
	
	public void addQueue(int newElement) {
		
		Node a= new Node(newElement); //info is the input, link is null
		
		if(front==null) //if queue is empty.
			front=rear=a; //front and rear linked to a.
		
		else {
			rear.setLink(a); //a setted as link of rear element so rear can reach to it by get function.
			rear=rear.getLink(); //now rear is on a node.
		}
	}
		
	public void deleteQueue() {
		
		if(isEmpty())
			System.out.println("Queue is empty! ");
		
		else {
			front=front.getLink(); //front goes to its link. First node will go to garbage collector.
			if(front==null) //if after deletion, the queue is empty,
			rear=null; //also set rear to null.
		}
		
	}
	
	public void outputQueue() {
		
		if(!isEmpty()) { //If the queue is not empty
			
		Node c =new Node(); //Info is zero and link is null.
		c=front; //link is front.
		
		while(c!=null)//current node is going around the elements from front to rear so when c is null, it means list is finished.
		System.out.println(c.getInfo());
		c= c.getLink();
		
		}
		
	}
		
/*
 * --Methods that we added--
 * isEmpty
 * initializeQueue
 * getFront
 * getRear
 * addQueue
 * deleteQueue
 * outputQueue
 * 
 */
}
