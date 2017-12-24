package StackLinkedListBasedImplementation;

public class Node {

	private int info;
	private Node link;
	
// Getters and Setters.	
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
		this.link=link;
	}
	
	public Node() {
		
		link=null;
		info=0;
		
	}
	
	public Node(int newInfo) {
		
		setInfo(newInfo); //creating node with info.
		link=null; //link is null so we are adding the node to the last.
		
	}
	
	public Node(int newInfo, Node linkValue) {
		
		setInfo(newInfo);
		setLink(linkValue); //also setting the link.
	}
	
	
	
}
