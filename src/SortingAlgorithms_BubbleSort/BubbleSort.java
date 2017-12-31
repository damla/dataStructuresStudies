package SortingAlgorithms_BubbleSort;

/*  --Bubble Sort--
 * 
 * Compare 2 elements and swap.
 * Think like a bubble goes around the list.
 * 
 */

import java.util.Random;

public class BubbleSort {
	
	private int[] data; //Array made of integers.
	private static Random generator=new Random(); //to generate array made of random numbers.
	
	public BubbleSort(int size) {
// Constructor generating array with the size you wrote.
		data=new int[size];
		
		for(int i=0; i<size; i++) {
			
			data[i]=10+generator.nextInt(90); //between 10 and 100
			
		}	
	}
		
	public void swap(int first, int last) {
		
		int temp=data[first]; //to prevent the first data.
		data[first]=data[last]; //assigned last to first.
		data[last]=temp; //assigned first to last.
		
	}
	
	public void sort() {
// To find where we will swap.
		
		for(int i=1; i<data.length; i++) { //size=data.length
			for(int j=0; j<data.length-i; j++) { //In the first cycle, it will compare with every element.
// After 1st cycle it won't compare with the last elements again.
				if(data[j]>data[j+1]) //0-1, 1-2, 2-3 ...
					swap(j, j+1);
			}
		}
	}
	
	public String toString() {
// To print the elements.		
		String temp = new String(); //to add String continuously.
		
			for(int element:data) {
				temp = temp + element + " ";
			}
			
		return temp;
	}
		
}
