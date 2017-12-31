package SortingAlgorithms_BubbleSort;

public class BubbleSortStaticMethod {

	public static void bubbleSort(int[]data) {
	
		int temp;
		
		for(int i=1; i<data.length; i++) {
			
			for(int j=0; j<data.length-1; j++) {
				
				if(data[j] > data[j+1]) { 
				
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}	
	}
	
	public static void main(String[]args) {
		
		int a[]= {5, 3, 2, 7, 98, 12, 13, 92};
		
		System.out.print ("Unsorted array: ");
		
		for(int element:a)
			System.out.print(element + " ");
		
		bubbleSort(a); //Sorted.
		
		System.out.print("\nSorted array: ");
		for(int element: a)
			System.out.print(element + " ");


		
	}
	
}
