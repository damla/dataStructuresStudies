package SortingAlgorithms_SelectionSort;

public class Test {

	public static void main(String[]args) {
		
		SelectionSort x=new SelectionSort(10);
		
		System.out.print("Unsorted array: ");
		System.out.println(x);
		
		x.sort();
		
		System.out.print("Sorted array: ");
		System.out.println(x);
	}
}
