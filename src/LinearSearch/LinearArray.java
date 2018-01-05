package LinearSearch;

import java.util.Random;

public class LinearArray {

	private int[]data;
	private static Random generator=new Random();
	
	public LinearArray(int size) {
// Generating new array.
		
		data=new int[size];
		
		for(int i=0; i<size; i++) {
			data[i]= 10+ generator.nextInt(90);
		}
	}
	
	public int linearSearch(int key) {
// Searching from beginning to the end of the list. Returns the value's index.		
		
		for(int i=0; i<data.length; i++) {
			if(data[i]==key) {
				return i;
			}
		}
		return -1; //If the value is not in the list, it will return -1.
	}
	
	public String toString() {
		
		String temp=new String();
		
		for(int element:data) {
			temp=temp+element+" ";
		}
		return temp;
	}
}
