package QueueArrayBased;

import java.util.Scanner;

public class Queue {
/* ---Notes about Queue
 * First in first out data structure.
 * Added at one end.(rear)
 * Deleted from the other end.(front)
 * Can not access to middle elements.
 * 
 * 
 * If the queue is full, we can start it again from index zero. (If it is empty.)
 * queuRear =(queue+1)% maxQueueSize;
 * queue=99%99=0; //then lets write it to 0th index.
 * 
 * There may be a problem with the understanding if the queue is full or empty.
 * 1st solution is we can add count.
 * 2nd solution is ?
 */
	

	private int[]queueArray;
	private int size;
	private int front;
	private int rear;
	private int count;
	
	public Queue() {
// Constructor with size 10.
		
		size=10;
		queueArray=new int[size];
		front=0;
		rear=size-1;
		count=0;
		
	}
	
	public Queue(int newSize) {
// Constructor with parameter size.
		
		Scanner sc=new Scanner(System.in);
		while(newSize<=0) { //for invalid values
			
			System.out.println("Please enter a valid value: ");
			newSize=sc.nextInt();
			
		}
		sc.close();
		
		size=newSize;
		queueArray=new int[size];
		front=0;
		rear=size-1;
		count=0;
		
	}
	
	public void initializeQueue() {
// Initializes the queue to empty state.
		
		front=0;
		rear=size-1;
		count=0;
		
	}
	
	public boolean isEmpty() {
		
		return(count==0);
		
	}
	
	public boolean isFull() {
		
		return (count==size);
		
	}
	
	public int getFront() {
		
		assert(!isEmpty()); 
		return queueArray[front];
		
	}
	
	public int getRear() {
		
		assert(!isEmpty());
		return queueArray[rear];
		
	}
	
	public void addQueue(int newElement) {
		
		if(!isFull()) {
			
			rear=(rear+1)%size; //rear swipes to right.
			count++;
			queueArray[rear]=newElement;
			
		}
		else
			System.out.println("Queue is full!" );
	}
	
	public void deleteQueue() {
		
		if(!isEmpty()) {
			
			count--;
			front=(front+1)%size; //front swipes to right.
			
		}
		else
			System.out.println("Queue is empty!");	
	}
	
	public void outputQueue() {
		
		if(count!=0) {
			
			for(int i=front; i<=rear; i++) { //it will print from rear to front.
				System.out.println(queueArray[i]);
			}
		}
	}
/* --Methods that we added--
 * 	
 * initializeQueue
 * isEmpty
 * isFull
 * getFront
 * getRear
 * addQueue
 * deleteQueue
 * outputQueue
 * 
 */
	
}
