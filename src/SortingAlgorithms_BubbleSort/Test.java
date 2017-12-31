package SortingAlgorithms_BubbleSort;

public class Test {

	public static void main(String[]args) {
		
		BubbleSort a=new BubbleSort(10);
		
		System.out.print("Unsorted Array: ");
		System.out.println(a);
		
		System.out.print("Sorted with Bubble Sort: ");
		a.sort();
		System.out.println(a);
		
	}
}
