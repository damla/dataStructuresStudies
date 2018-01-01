package SortingAlgorithms_SelectionSort;

public class SelectionSortStaticMethod {

	public static void selectionSort(int[]data) {
		
		int smallest;
		
		for(int i=0; i<data.length-1; i++) { 
			
			smallest=i; //saving smallest value.
			
			for(int j=i+1; j<data.length; j++) {
				
				if(data[j]<data[smallest]) {
					
					smallest=j; //Takes smallest index.
					
				}
				
			int temp=data[i];
			data[i]=data[smallest];
			data[smallest]=temp;
			
			}	
		}
	}
	
	public static void main(String[]args) {
		
		int x[]= {2, 45, 7, 2, 67, 12, 56, 23};
		
		System.out.print("Unsorted array: ");
		for(int element:x) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
		selectionSort(x);
		
		System.out.print("Sorted array: ");
		for(int element:x) {
			System.out.print(element + " ");
		}
		
		
	}
}
