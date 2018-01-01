package SortingAlgorithms_SelectionSort;

import java.util.Random;
public class SelectionSort {

	private int[]data;
	private static Random generator=new Random();
	
	public SelectionSort(int size) {
// Constructor with size.		
		data=new int[size];
		
		for(int i=0; i<size; i++) {
			data[i]=10+generator.nextInt(90); //numbers between 10 and 100.
		}
		
	}
	
	public void swap(int first, int last) {
		
		int temp=data[first];
		data[first]=data[last];
		data[last]=temp;
		
	}
	
	public String toString() {
		
		String temp=new String();
		
		for(int element:data)
			temp= temp+element+" ";
		
		return temp;
	}
	
	public void sort() {
		
		int smallest; //to save smallest index.
		
		for(int i=0; i<data.length-1; i++) {
			smallest=i;
			
			for(int j=i+1; j<data.length; j++) {
				
				if(data[j]<data[smallest]) {
					smallest=j;
				} //Compared ith element with all elements and decided the smallest one.
			}
			
			swap(i, smallest); //Swaped the smallest one with i.
			printPass(i+1,smallest); //prints the pass.
			
		}
	}
	
	public void printPass(int pass, int index) {
		
		int i,j;
		System.out.println("after pass: " + pass); //pass number take parameter input from sort function.
		
		for(i=0; i<index; i++)
			System.out.print(data[i] + " "); //prints after pass but stops when it comes to index.
		
		System.out.print(data[index] + "* "); //Puts star after the change.
		
		for(i = index + 1; i < data.length; i++) //Continue to print after index(smallest).
			System.out.print(data[i] + " "); 
		
		System.out.println("\n");
		
		for(j = 0; j < pass; j++) //puts -- pass times.
			System.out.print("-- ");
		
		System.out.println("\n");
		
		}
	
	}
