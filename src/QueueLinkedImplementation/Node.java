package QueueLinkedImplementation;

/* --LinkedList Impementation--
 * 
 * In the array the size of queue is fixed but in linked list its not.
 * 
 * Enqueueing a node--> Find the rear, change it to point to the new node, change the rear.
 * Dequeueing a node--> Find the front, find the element pointed by front, change it as front.
 */
public class Node {

	private int info;
	private Node link;
	
// Getters and Setters
	
	public Node() {
// Default constructor
		
		link=null;
		info=0;
		
	}
	
	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Node(int newInfo) {
// Constructor with info parameter.		
		
		setInfo(newInfo);
		link=null;
	}
	
	public Node(int newInfo, Node linkValue) {
// Constructor with both parameters.
		
		setInfo(newInfo);
		link=linkValue;
		
	}

}
